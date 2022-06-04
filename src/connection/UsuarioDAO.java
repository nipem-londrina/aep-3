package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import aep.Usuario;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public static boolean login(Usuario user, String email, char[] senha) {
        boolean ok = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("select id, senha from Usuario where email = ?");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            if (rs.next() && Arrays.equals(senha, rs.getString("senha").toCharArray())) {
                stmt = con.prepareStatement("select * from Usuario where id = ?");
                stmt.setInt(1, rs.getInt("id"));
                rs = stmt.executeQuery();
                rs.next();
                
                user.setId(rs.getInt("id"));
                user.setPerfil(rs.getString("perfil").charAt(0));
                user.setIdEmpresa(rs.getInt("idEmpresa"));
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setCpf(rs.getString("cpf"));
                user.setStatus((byte) rs.getInt("status"));
                ok = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ok;
    }
}
