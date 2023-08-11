/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sachh;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class DBConnect {
    public static Connection ketnoi(String db){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connect = "jdbc:sqlserver://localhost:1433;databaseName="+db;
            Connection conn = DriverManager.getConnection(connect, "Tamltt24", "123");
            return conn;
        } catch (Exception ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Looxi 1");
            return null;
        }   
    }
}
