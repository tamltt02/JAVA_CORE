/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.NhanVien;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NhanVienDAO implements EdusyDAO<NhanVien> {

    PreparedStatement _ps;
    Statement _st;
    Connection conn;
    List<NhanVien> _list = new ArrayList();

    public NhanVienDAO() {
        conn = Utils.JdbcUtils.getConnection();
    }

    @Override
    public List<NhanVien> getDataQuery() {
        _list.removeAll(_list);
        try {
            String sql = "select * from nhanvien";
            _st = conn.createStatement();
            ResultSet rs = _st.executeQuery(sql);
            while (rs.next()) {
                _list.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
            }
            return _list;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public void them(NhanVien nv) {
        try {
            String sql = "insert into nhanvien (manv, matkhau,hoten,vaitro) values (?,?,?,?)";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, nv.getmaNV());
            _ps.setString(2, nv.getmatKhau());
            _ps.setString(3, nv.gethoTen());
            _ps.setBoolean(4, nv.isvaiTro());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public void sua(NhanVien nv) {
        try {
            String sql = "update  nhanvien  set matkhau =?,hoten=?,vaitro =? where manv =?";
            _ps = conn.prepareStatement(sql);
            _ps.setString(4, nv.getmaNV());
            _ps.setString(1, nv.getmatKhau());
            _ps.setString(2, nv.gethoTen());
            _ps.setBoolean(3, nv.isvaiTro());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public void xoa(NhanVien nv) {
        try {
            String sql = "delete  nhanvien where manv =?";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, nv.getmaNV());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
