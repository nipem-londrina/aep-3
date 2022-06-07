package connection;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Arrays;
import model.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class UsuarioDAO {

    public static void cadastrar(Usuario user, char[] senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        try {
            stmt = con.prepareStatement("INSERT INTO Usuario (perfil, senhaHash, senhaSal, idEmpresa, nome, email, cpf, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, String.valueOf(user.getPerfil()));
            stmt.setBytes(2, pbkdf2(senha, salt));
            stmt.setBytes(3, salt);
            stmt.setInt(4, user.getIdEmpresa());
            stmt.setString(5, user.getNome());
            stmt.setString(6, user.getEmail());
            stmt.setString(7, user.getCpf());
            stmt.setInt(8, user.getStatus());
            stmt.executeUpdate();
            System.out.println("cadastado");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static boolean login(Usuario user, String email, char[] senha) {
        boolean ok = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("select id, senhaHash, senhaSal from Usuario where email = ?");
            stmt.setString(1, email);
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
                    user.setStatus((byte) rs.getInt("status"));
                    ok = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return id + "";
    }
}
