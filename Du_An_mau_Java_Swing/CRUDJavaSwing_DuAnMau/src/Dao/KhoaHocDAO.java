/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.KhoaHoc;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class KhoaHocDAO implements EdusyDAO<KhoaHoc> {

    PreparedStatement _ps;
    Statement _st;
    Connection conn;
    List<KhoaHoc> _list = new ArrayList();

    public KhoaHocDAO() {
        conn = Utils.JdbcUtils.getConnection();
    }

    @Override
    public List<KhoaHoc> getDataQuery() {
        _list.removeAll(_list);
        try {
            String sql = "select * from khoahoc";
            _st = conn.createStatement();
            ResultSet rs = _st.executeQuery(sql);
            while (rs.next()) {
                _list.add(new KhoaHoc(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8)));
            }
            return _list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void them(KhoaHoc kh) {
        try {
            String sql = "insert into khoahoc ( maCD,hocphi,thoiluong,ngayKG,ghichu,maNV,ngaytao) values (?,?,?,?,?,?,?)";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, kh.getMaCD());
            _ps.setDouble(2, kh.getHocPhi());
            _ps.setInt(3, kh.getThoiLuong());
            _ps.setDate(4, new java.sql.Date(kh.getNgayKG().getTime()));
            _ps.setString(5, kh.getGhiChu());
            _ps.setString(6, kh.getMaNV());
            _ps.setDate(7, new java.sql.Date(kh.getNgayDK().getTime()));
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void sua(KhoaHoc kh) {
        try {
            String sql = "update khoaHoc set maCD=?,hocphi=?,thoiluong =?,ngayKG=?,ghichu=?,maNV=?,ngaytao=? where maKH=?";
            _ps = conn.prepareStatement(sql);
            _ps.setInt(8, kh.getMaKH());
            _ps.setString(1, kh.getMaCD());
            _ps.setDouble(2, kh.getHocPhi());
            _ps.setInt(3, kh.getThoiLuong());
            _ps.setDate(4, new java.sql.Date(kh.getNgayKG().getTime()));
            _ps.setString(5, kh.getGhiChu());
            _ps.setString(6, kh.getMaNV());
            _ps.setDate(7, new java.sql.Date(kh.getNgayDK().getTime()));
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void xoa(KhoaHoc kh) {
        try {
            String sql = "delete khoaHoc where maKH=?";
            _ps = conn.prepareStatement(sql);
            _ps.setInt(1, kh.getMaKH());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
