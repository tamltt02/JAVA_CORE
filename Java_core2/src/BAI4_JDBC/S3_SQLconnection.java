/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_JDBC;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class S3_SQLconnection {

    static String hostName = "localhost";
    static String acc = "Tamltt24";
    static String pass = "123";
    static String dbName = "DungNA_ShopFPT";
    static String connectionSQL = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;

    public static void main(String[] args) {
        try {
            //Load diver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           // com.microsoft.sqlserver.jdbc.SQLServerDriver
           //Tajo kết nối 
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DungNA_ShopFPT", acc, pass);
            
            //Tạo statement sau đó mới thực thi câu lệnh
            Statement st = conn.createStatement();
            
            //Thực thi câu lệnh
            String query = "SELECT * FROM CHUCVU";

            ResultSet rs = st.executeQuery(query);
             while (rs.next()) {                
                System.out.println(rs.getString(1));
            }
            st.close();
            conn.close();
            System.out.println("Kết nối thành công");
            
        } catch (Exception ex) {
            System.out.println("Kết nối thất bại");            
        }
    }
}
