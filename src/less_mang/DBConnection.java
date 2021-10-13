/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_mang;
import java.sql.*;



/**
 *
 * @author kasun
 */
public class DBConnection {
   
    static final String DB_URL="jdbc:mysql://localhost/lesson_manager";
    static final String USER="root";
    static final String PASS="";
    public static Connection connectDB(){
    Connection conn;
        try{
            //register jdbc driver , not 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //open connection
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            DBConnection prepareStatement;
            return conn;
            
        }
        catch(ClassNotFoundException | SQLException ex){
           System.out.println("DB Connection Error");
           return null;
        }
    }
}
