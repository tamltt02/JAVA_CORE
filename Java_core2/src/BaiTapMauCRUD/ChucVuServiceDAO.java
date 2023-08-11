/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMauCRUD;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author ADMIN
 */
public class ChucVuServiceDAO {

    final String INSERT_SQL = "INSERT INTO dbo.[ChucVu] ([MaChucVu],[TenChucVu]) VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE dbo.[ChucVu] SET [MaChucVu] = ? WHERE [IdChucVu] = ?";
    final String DELETE_SQL = "DELETE FROM dbo.[ChucVu] WHERE [IdChucVu] = ?";
    final String SELECT_BY_ID = "SELECT * FROM dbo.[ChucVu] WHERE [IdChucVu] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM dbo.[ChucVu] ";
    List<ChucVu> _liChucVus;
    

    public ChucVuServiceDAO() {
        _liChucVus = new ArrayList();
    }

    public String insert(ChucVu cv) {
        DBConnection.ExcuteDungna(INSERT_SQL, cv.getMaChucVu(), cv.getTenChucVu());
        return "Insert thành công";
    }

    public String update(ChucVu cv) {
        DBConnection.ExcuteDungna(UPDATE_SQL, cv.getMaChucVu(),cv.getIdChucVu());
        return "update thành công";
    }
    public String delete(ChucVu cv) {
        DBConnection.ExcuteDungna(DELETE_SQL, cv.getIdChucVu());
        return "update thành công";
    }
    public List<ChucVu> selectAll(){
        return getSelectSQL(SELECT_ALL_SQL);
    }
    public List<ChucVu> getSelectSQL(String sql , Object... args){
        try {
            ResultSet rs = DBConnection.getDadaFromQuery(sql, args);
            while (rs.next()) {                
                _liChucVus.add(new ChucVu(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            return _liChucVus;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
}
