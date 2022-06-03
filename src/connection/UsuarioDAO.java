package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
//    public void create() {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//
//        try {
//            stmt = con.prepareStatement("");
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public static String fetchSenha(String email) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String retorno = null;
        
        try {
            stmt = con.prepareStatement("select senha from Usuario where email = ?");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            rs.next();
            retorno = rs.getString("senha");
        } catch (SQLException ex) {
            throw new RuntimeException("Erro no login: ", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return retorno;
    }
}
