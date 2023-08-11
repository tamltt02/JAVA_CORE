/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DBConnect.DbConnect;
import Object.HoaDon;
import Object.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonService implements IsService.IsService<HoaDon>{
    List<HoaDon> _liHoaDons;
    DBConnect.DbConnect _dConnect;
    String store = "{call SP_HoaDon(?,?,?,?,?,?)}";

    public HoaDonService() {
        _liHoaDons = new ArrayList();
        _dConnect =  new DbConnect();
        getdataQuery();
    }
    
    @Override
    public String store(HoaDon x, String a) {
       if (x == null) {
            return "Không thành công";
        }
        if (!a.equals("SELECT")) {
            _dConnect.Excute(store, x.getId(), x.getMa(), x.getNgayTao(),x.getTinhtrang(),x.getIdNV(), a);
            getdataQuery();
        return "thành công";

        }
        return "Tb";
    }

    @Override
    public void getdataQuery() {
         try {
            _liHoaDons.removeAll(_liHoaDons);
         ResultSet rs = _dConnect.getdataQuery("SELECT * FROM HoaDon");
            while (rs.next()) {
                _liHoaDons.add(new HoaDon(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5)));
            }
          
        } catch (SQLException ex) {
            System.out.println("Lỗi");
        }
    }

    @Override
    public List<HoaDon> getlist() {
       return _liHoaDons;
    }

    @Override
    public List<HoaDon> sort(int temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> find(String a) {
         List<HoaDon> list = new ArrayList();
        for (HoaDon x : _liHoaDons) {
            if(x.getTinhtrang() == Integer.parseInt(a)) {
                list.add(x);
            }
        }
        return list;
    }
    
      public int getIndexByMa(String ma){
        for (int i = 0; i < _liHoaDons.size(); i++) {
            if(_liHoaDons.get(i).getMa().equals(ma)){
                return i;
            }
        }
        return -3;
    }
    
    
    
}
