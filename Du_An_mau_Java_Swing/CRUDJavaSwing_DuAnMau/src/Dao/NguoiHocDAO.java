/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.NguoiHoc;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NguoiHocDAO implements EdusyDAO<NguoiHoc> {

    PreparedStatement _ps;
    Statement _st;
    Connection conn;
    List<NguoiHoc> _list = new ArrayList();

    public NguoiHocDAO() {
        conn = Utils.JdbcUtils.getConnection();
        
    }

    @Override
    public List<NguoiHoc> getDataQuery() {
        _list.removeAll(_list);
        try {
            String sql = "select * from nguoihoc";
            _st = conn.createStatement();
            ResultSet rs = _st.executeQuery(sql);
            while (rs.next()) {
                _list.add(new NguoiHoc(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9)));
            }
            return _list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void them(NguoiHoc nh) {
        try {
            String sql = "insert into nguoihoc (maNH,hoten,ngaysinh,gioitinh,dienthoai,email, ghichu, maNV,ngayDK) values (?,?,?,?,?,?,?,?,?)";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, nh.getMaNH());
            _ps.setString(2, nh.getHoTen());
            _ps.setDate(3, new java.sql.Date(nh.getNgaySinh().getTime()));
            _ps.setBoolean(4, nh.isGioiTinh());
            _ps.setString(5, nh.getDienThoai());
            _ps.setString(6, nh.getEmail());
            _ps.setString(7, nh.getGhiChu());
            _ps.setString(8, nh.getMaNV());
            _ps.setDate(9, new java.sql.Date(nh.getNgayDK().getTime()));
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void sua(NguoiHoc nh) {
        try {
            String sql = "update  nguoihoc set hoten = ? ,ngaysinh= ? ,gioitinh= ? ,dienthoai= ? ,email=?, ghichu= ? , maNV= ?, ngayDK= ?  where maNH = ?";
            _ps = conn.prepareStatement(sql);
            _ps.setString(9, nh.getMaNH());
            _ps.setString(1, nh.getHoTen());
            _ps.setDate(2, new java.sql.Date(nh.getNgaySinh().getTime()));
            _ps.setBoolean(3, nh.isGioiTinh());
            _ps.setString(4, nh.getDienThoai());
            _ps.setString(5, nh.getEmail());
            _ps.setString(6, nh.getGhiChu());
            _ps.setString(7, nh.getMaNV());
            _ps.setDate(8, new java.sql.Date(nh.getNgayDK().getTime()));
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void xoa(NguoiHoc nh) {
        try {
            String sql = "delete  nguoihoc where maNH = ?";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, nh.getMaNH());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
