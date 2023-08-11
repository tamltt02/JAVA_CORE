/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DBConnect.DbConnect;
import Object.HDCT;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author ADMIN
 */
public class HDCTService implements IsService.IsService<HDCT> {

    List<HDCT> _liHdcts;
    DBConnect.DbConnect _dConnect = new DbConnect();
    String store = "{call SP_HOADONCT(?,?,?,?,?,?)}";
    public HDCTService() {
        _liHdcts = new ArrayList();
        
    }

    @Override
    public String store(HDCT x, String a) {
        if (x == null) {
            return "Không thành công";
        }
        if (!a.equals("SELECT")) {
            _dConnect.Excute(store, x.getIdHoaDon(), x.getIdSanPham(), x.getSoLuong(),  x.getDonGia(),x.getStt(), a);
            getdataQuery();
        return "thành công";

        }
        return "Tb";
    }

    @Override
    public void getdataQuery() {
         try {
            _liHdcts.removeAll(_liHdcts);
         ResultSet rs = _dConnect.getdataQuery("SELECT * FROM HoaDonChiTiet");
            while (rs.next()) {
                _liHdcts.add(new HDCT(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getFloat(4), rs.getInt(5)));
            }
          
        } catch (SQLException ex) {
            System.out.println("Lỗi");
        }
    }
      public  List<HDCT> getList(int id) {
       try {
            List<HDCT> list = new ArrayList<>();
            Connection conn = _dConnect.openConnection();
            String sql = "SELECT * FROM HoaDonChiTiet WHERE IdHoaDon = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new HDCT(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5)));
            }

            conn.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<HDCT> getlist() {
        return _liHdcts;
    }

    @Override
    public List<HDCT> sort(int temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HDCT> find(String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
