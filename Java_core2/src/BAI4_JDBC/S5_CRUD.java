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
public class S5_CRUD {
     public static void main(String[] args) {
        try {
           //Tajo kết nối 
            Connection conn = new S5_CRUD().getconnectionDB();
            
            //Tạo statement sau đó mới thực thi câu lệnh
            Statement st = conn.createStatement();
           
            // Bai 1. insert
            String insert = "INSERT INTO[ChucVu] ([MaChucVu],[TenChucVu])" + "Values('tamtt24','quản lý')";
            st.executeLargeUpdate(insert);
            st.close();
            conn.close();
            System.out.println("Kết nối thành công");
            
        } catch (Exception ex) {
            System.out.println("Kết nối thất bại");    
            ex.printStackTrace();
        }
    }
    Connection getconnectionDB(){
        try {
            String url ="jdbc:sqlserver://localhost:1433;databaseName=DungNA_ShopFPT";
            String acc = "Tamltt24",pass ="123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          
           // System.out.println("Kết nối thành công!");
            return DriverManager.getConnection(url, acc, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Kết nối thất bại");
        return null;
    }
}
