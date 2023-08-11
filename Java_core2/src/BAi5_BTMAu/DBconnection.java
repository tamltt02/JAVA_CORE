/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAi5_BTMAu;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class DBconnection {
     private static String hostName = "localhost";
    private static String acc = "Tamltt24";
    private static String pass = "123";
    private static String dbName = "FINAL_ASSIGNMENT_JAVA3_DUNGNA29";
    private static String connectionSQL = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection conn;
    static {
        try {
            Class.forName(driver);// khởi tạo trình điều kiển của jdbc
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi driver");
        }
    }

    // 1 Mở kết nối
    static Connection openDbConnection() {
        try {
            return DriverManager.getConnection(connectionSQL, acc, pass);
        } catch (SQLException ex) {   
            return null;
        }
    }

}
