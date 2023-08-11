/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class JdbcUtils {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connect = "jdbc:sqlserver://localhost:1433;databaseName=EduSys";
                Connection conn = DriverManager.getConnection(connect, "Tamltt24", "123");
                return conn;
            } catch (Exception ex) {
               ex.printStackTrace();
            }
        }
        return conn;
    }
}
