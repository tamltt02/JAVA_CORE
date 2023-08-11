/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMauCRUD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DBConnection {// Lớp này xử lý truy vấn 

    private static String hostName = "localhost";
    private static String acc = "Tamltt24";
    private static String pass = "123";
    private static String dbName = "DungNA_ShopFPT";
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

    //2. Thực thi truy vấn
    static int ExcuteDungna(String sql, Object... args) {
        PreparedStatement pstm = getsStatement(sql, args);
        try {
            try {
                return pstm.executeUpdate();// thực hiện câu lệnh insert, update,delete
            } finally {
                pstm.close();
            }            
        } catch (Exception ex) {
            System.out.println("Lỗi tại excutedungna");
            ex.printStackTrace();
            return 0;
        } 
    }

    //3. Trả lại 1 tập đối tượng// result: đại diện cho tập hợp bản ghi sau khi thực hiện truy vấn
    static ResultSet getDadaFromQuery(String sql, Object... args) throws SQLException { // 
        PreparedStatement pstm = getsStatement(sql, args);
        return pstm.executeQuery(); 
    }
    //4. Chuẩn bị câu truy vấn trước khi thực thi

    static PreparedStatement getsStatement(String sql, Object... args) {// định dạng trên code
        try {
            conn = openDbConnection();
            PreparedStatement ps;
           // ps = conn.prepareCall(sql);//Gọi store procedure
            ps = conn.prepareStatement(sql);// triển khai các câu lệnh truy vấn thường
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            return ps;
        } catch (Exception ex) {
            return null;
        }
    }
}
