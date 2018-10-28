
import java.sql.Connection;
import java.sql.DriverManager;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amit
 */
public class DBManager {
    
//    static Connection connection;
    
    public static Connection connectDB(){
        
        try {
            String url="jdbc:mysql://localhost:3306/library_db";
            String username="root";
            String password="jaimatade";
            
            // load and register the mysql connector
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            return connection;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
}
