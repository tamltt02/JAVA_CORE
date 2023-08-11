/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsach;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class dbconnect {
    public static Connection ketnoi(String db){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=" + db;
            Connection conn = DriverManager.getConnection(url, "Tamltt24", "123");
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
