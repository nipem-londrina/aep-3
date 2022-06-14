package br.com.sanity.connection;

import br.com.sanity.model.Formulario;
import br.com.sanity.model.Usuario;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://database-1.csiuul0muy6o.sa-east-1.rds.amazonaws.com:3306/X_AEP_GRUPO_TOP_X";
    private static final String USER = "admin";
    private static final String PASS = "adminadmin";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro na conexão");
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean cadastrar(Usuario user, char[] senha) {
        boolean ok = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        try {
            stmt = con.prepareStatement("INSERT INTO Usuario (perfil, senhaHash, senhaSal, idEmpresa, nome, email, cpf) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, String.valueOf(user.getPerfil()));
            stmt.setBytes(2, pbkdf2(senha, salt));
            stmt.setBytes(3, salt);
            stmt.setInt(4, user.getIdEmpresa());
            stmt.setString(5, user.getNome());
            stmt.setString(6, user.getEmail());
            stmt.setString(7, user.getCpf());
            stmt.executeUpdate();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return ok;
    }

    public static boolean login(Usuario user, char[] senha) {
        boolean ok = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("select id, senhaHash, senhaSal from Usuario where email = ?");
            stmt.setString(1, user.getEmail());
            rs = stmt.executeQuery();
            if (rs.next() && Arrays.equals(pbkdf2(senha, rs.getBytes("senhaSal")), rs.getBytes("senhaHash"))) {
                stmt = con.prepareStatement("select * from Usuario where id = ?");
                stmt.setInt(1, rs.getInt("id"));
                rs = stmt.executeQuery();
                if (rs.next()) {
                    user.setId(rs.getInt("id"));
                    user.setPerfil(rs.getString("perfil").charAt(0));
                    user.setIdEmpresa(rs.getInt("idEmpresa"));
                    user.setNome(rs.getString("nome"));
                    user.setEmail(rs.getString("email"));
                    user.setCpf(rs.getString("cpf"));
                    user.setAtivo(rs.getBoolean("ativo"));
                    ok = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ok;
    }

    private static byte[] pbkdf2(char[] password, byte[] salt) {
        KeySpec spec = new PBEKeySpec(password, salt, 1, 128);
        try {
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return f.generateSecret(spec).getEncoded();
        } catch (InvalidKeySpecException | NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }

    public static String getEmpresa(int id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("select nome from Empresa where id = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return id + "";
    }

    public static ArrayList<Usuario> getDezColaboradores(Usuario user, int pag, boolean c, boolean a) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("select id, nome, cpf from Usuario "
                    + "where idEmpresa = ? "
                    + ((c && !a) ? "and perfil = 'C' " : "")
                    + ((!c && a) ? "and perfil = 'A' " : "")
                    + "order by nome limit ?, 10");
            stmt.setInt(1, user.getIdEmpresa());
            stmt.setInt(2, (pag * 10));
            rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return lista;
    }

    public static ArrayList<Formulario> getDezFormularios(Usuario user, int pag) {
        ArrayList<Formulario> lista = new ArrayList<>();

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("select id, titulo from Formulario "
                    + "where idEmpresa = ? "
                    + "order by titulo limit ?, 10");
            stmt.setInt(1, user.getIdEmpresa());
            stmt.setInt(2, (pag * 10));
            rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new Formulario(
                        rs.getInt("id"),
                        rs.getString("titulo")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return lista;
    }

    public static Usuario getUsuario(int targetId) {
        Usuario target = new Usuario(targetId);
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("select perfil, nome, email, cpf, ativo "
                    + "from Usuario "
                    + "where id = ?");
            stmt.setInt(1, target.getId());
            rs = stmt.executeQuery();
            if (rs.next()) {
                target.setPerfil(rs.getString("perfil").charAt(0));
                target.setNome(rs.getString("nome"));
                target.setEmail(rs.getString("email"));
                target.setCpf(rs.getString("cpf"));
                target.setAtivo(rs.getBoolean("ativo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return target;
    }

    public static boolean alterarUsuario(Usuario target) {
        boolean ok = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("update Usuario set "
                    + "perfil = ?, "
                    + "nome = ?, "
                    + "email = ?, "
                    + "cpf = ? , "
                    + "ativo = ? "
                    + "where (id = ?)");
            stmt.setString(1, target.getPerfil() + "");
            stmt.setString(2, target.getNome());
            stmt.setString(3, target.getEmail());
            stmt.setString(4, target.getCpf());
            stmt.setBoolean(5, target.isAtivo());
            stmt.setInt(6, target.getId());
            stmt.executeUpdate();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

        return ok;
    }

    public static boolean cadastrarFormulario(Formulario form, ArrayList<String> perguntas) {
        boolean ok = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con.setAutoCommit(false);
            stmt = con.prepareStatement("insert into Formulario (titulo, descricao, idEmpresa) values (?, ?, ?)");
            stmt.setString(1, form.getTitulo());
            stmt.setString(2, form.getDescricao());
            stmt.setInt(3, form.getIdEmpresa());
            stmt.executeUpdate();

            stmt = con.prepareStatement("select LAST_INSERT_ID() as idFormulario");
            rs = stmt.executeQuery();
            rs.next();

            for (int i = 0; i < perguntas.size(); i++) {
                stmt = con.prepareStatement("insert into Pergunta (texto, idFormulario) values (?, ?)");
                stmt.setString(1, perguntas.get(i));
                stmt.setInt(2, rs.getInt("idFormulario"));
                stmt.executeUpdate();
            }

            con.commit();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ok;
    }
}
