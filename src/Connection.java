import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author moonc
 */
public class Connection {
    
    public static Connection Conn = null;
    public static Connection dbConnector()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            try {
                Conn = (Connection) DriverManager.getConnection("jdbc:sqlite:areaone.sqlite");
            } catch (SQLException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return Conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
