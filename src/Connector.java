import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author moonc
 */
public class Connector {
    
    public static Connection Conn = null;
    public static Connection dbConnection1()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Conn = DriverManager.getConnection("jdbc:sqlite:areaone.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
    
     public static Connection dbConnection2()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areatwo.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
      public static Connection dbConnection3()
    {
        try{
            Class.forName("org.sqlite.JDBC");
             //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areathree.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
       public static Connection dbConnection4()
    {
        try{
            Class.forName("org.sqlite.JDBC");
             //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areafour.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
        public static Connection dbConnection5()
    {
        try{
            Class.forName("org.sqlite.JDBC");
             //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areafive.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
         public static Connection dbConnection6()
    {
        try{
            Class.forName("org.sqlite.JDBC");
             //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areasix.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
          public static Connection dbConnection7()
    {
        try{
            Class.forName("org.sqlite.JDBC");
             //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areaseven.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
           public static Connection dbConnection8()
    {
        try{
            Class.forName("org.sqlite.JDBC");
             //update the name of that database
            Conn = DriverManager.getConnection("jdbc:sqlite:areaeight.sqlite");
            return Conn;
            
        }catch(Exception e)
        {
            return null;
        }
    }
    
    
    
}
