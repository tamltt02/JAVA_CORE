/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.ChuyenDe;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChuyenDeDAO implements EdusyDAO<ChuyenDe> {

    PreparedStatement _ps;
    Statement _st;
    Connection conn;
    List<ChuyenDe> _list = new ArrayList();

    public ChuyenDeDAO() {
        conn = Utils.JdbcUtils.getConnection();
    }

    @Override
    public List<ChuyenDe> getDataQuery() {
        _list.removeAll(_list);
        try {
            String sql = "select * from chuyende";
            _st = conn.createStatement();
            ResultSet rs = _st.executeQuery(sql);
            while (rs.next()) {
                _list.add(new ChuyenDe(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            return _list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void them(ChuyenDe cd) {
        try {
            String sql = "insert into chuyende ( maCD, tenCD,hocphi,thoiluong,hinh, mota) values (?,?,?,?,?,?)";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, cd.getMaCD());
            _ps.setString(2, cd.getTenCD());
            _ps.setDouble(3, cd.getHocPhi());
            _ps.setInt(4, cd.getThoiLuong());
            _ps.setString(5, cd.getHinh());
            _ps.setString(6, cd.getMoTa());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public void sua(ChuyenDe cd) {
        try {
            String sql = "update chuyende set tenCD=?,hocphi=?,thoiluong=?,hinh=?, mota=? where maCD =?";
            _ps = conn.prepareStatement(sql);
            _ps.setString(6, cd.getMaCD());
            _ps.setString(1, cd.getTenCD());
            _ps.setDouble(2, cd.getHocPhi());
            _ps.setInt(3, cd.getThoiLuong());
            _ps.setString(4, cd.getHinh());
            _ps.setString(5, cd.getMoTa());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void xoa(ChuyenDe cd) {
        try {
            String sql = "delete chuyende  where maCD =?";
            _ps = conn.prepareStatement(sql);
            _ps.setString(1, cd.getMaCD());
            _ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
