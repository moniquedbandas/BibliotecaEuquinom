package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
    
    public Connection getConnection(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca_euquinom", "root", "");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
