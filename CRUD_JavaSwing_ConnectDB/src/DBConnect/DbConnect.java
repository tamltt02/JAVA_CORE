/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnect;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DbConnect {

    public String acc = "Tamltt24", pass = "123";
    public String connection = "jdbc:sqlserver://localhost:1433;databaseName=FINAL_ASSIGNMENT_JAVA3_DUNGNA29";
    public String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public Connection conn;

    void chay() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi 1");
        }
    }

    public Connection openConnection() {
        try {
            return DriverManager.getConnection(connection, acc, pass);
        } catch (SQLException ex) {
            System.out.println("Loi2");
            return null;
        }
    }
    
    public CallableStatement getStatement(String sql, Object...a){
        try {
            conn = openConnection();
            CallableStatement cs = conn.prepareCall(sql);
            for (int i = 0; i < a.length; i++) {
                cs.setObject(i+1, a[i]);
            }
            return cs ;
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Loi3");
            return null ;
        }
    }
    
    public ResultSet getdataQuery(String sql, Object...a){
        CallableStatement cs = getStatement(sql, a);
        try {
            return cs.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
    }
    
    public int Excute(String sql, Object...a){
        CallableStatement cs = getStatement(sql, a);
        try {
            try {
                return cs.executeUpdate();
            } finally {
                cs.close();
            }
        } catch (Exception e) {
            System.out.println("Looxi");
            e.printStackTrace();
            return 0;
        }
    }
}
