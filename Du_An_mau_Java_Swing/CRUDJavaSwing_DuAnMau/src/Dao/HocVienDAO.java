/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.HocVien;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class HocVienDAO implements EdusyDAO<HocVien> {

    PreparedStatement _ps;
    Statement _st;
    Connection conn;
    List<HocVien> _list = new ArrayList();

    public HocVienDAO() {
        conn = Utils.JdbcUtils.getConnection();
    }

    @Override
    public List<HocVien> getDataQuery() {
        _list.removeAll(_list);
        try {
            String sql = "select * from hocvien";
            _st = conn.createStatement();
            ResultSet rs = _st.executeQuery(sql);
            while (rs.next()) {
                _list.add(new HocVien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4)));
            }
            return _list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void them(HocVien hv) {
        try {
            String sql = "insert into hocvien (maKH,maNH,diem) values (?,?,?)";
            _ps = conn.prepareStatement(sql);
            _ps.setInt(1, hv.getMaKH());
            _ps.setString(2, hv.getMaNH());
            _ps.setDouble(3, hv.getDiem());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void sua(HocVien hv) {
        try {
            String sql = "update hocvien set maKH =?,maNH=?,diem =? where maHV =? ";
            _ps = conn.prepareStatement(sql);
            _ps.setInt(1, hv.getMaKH());
            _ps.setInt(4, hv.getMaHV());
            _ps.setString(2, hv.getMaNH());
            _ps.setDouble(3, hv.getDiem());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void xoa(HocVien hv) {
        try {
            String sql = "delete hocvien where maHV =? ";
            _ps = conn.prepareStatement(sql);
            _ps.setInt(1, hv.getMaHV());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
