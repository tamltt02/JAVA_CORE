/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DBConnect.DbConnect;
import Object.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPhamService implements IsService.IsService<SanPham> {

    List<SanPham> _listPhams;
    DBConnect.DbConnect _dBconection;

    final String store = "{call SP_SanPham(?,?,?,?,?,?,?,?,?,?,?)}";

    public SanPhamService() {
        _listPhams = new ArrayList();
        _dBconection = new DbConnect();
        getdataQuery();
    }

    @Override
    public String store(SanPham x, String a) {
        if (x == null) {
            return "Không thành công";
        }
        if (!a.equals("SELECT")) {
            _dBconection.Excute(store, x.getId(), x.getMa(), x.getTen(), x.getNamBaoHanh(), x.getTrongLuong(), x.getMota(), x.getSLSPton(), x.getGiaNhap(), x.getGiaBan(), x.getIdDSP(), a);
            getdataQuery();

        }
        return "thành công";
    }

    @Override
    public void getdataQuery() {
           try {
            _listPhams.removeAll(_listPhams);
         ResultSet rs = _dBconection.getdataQuery("SELECT * FROM SanPham");
            while (rs.next()) {
                _listPhams.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5),  rs.getString(6), rs.getInt(7), rs.getFloat(8), rs.getFloat(9), rs.getInt(10)));
            }
          
        } catch (SQLException ex) {
            System.out.println("Lỗi");
        }
    }

    @Override
    public List<SanPham> getlist() {
       return _listPhams;
    }

    @Override
    public List<SanPham> sort(int temp) {
       if(temp==1){
             _listPhams.sort(Comparator.comparing(SanPham::getMa));
             return _listPhams;
     }
         _listPhams.sort(Comparator.comparing(SanPham::getMa).reversed());
         return _listPhams; 
    }

    @Override
    public List<SanPham> find(String a) {
         List<SanPham> list = new ArrayList();
        for (SanPham x : _listPhams) {
            if(x.getMa().toLowerCase().contains(a.toLowerCase()) || x.getTen().toLowerCase().contains(a.toLowerCase())){
                list.add(x);
            }
        }
        return list;
    }
     public int getIndexByMa(String ma){
        for (int i = 0; i < _listPhams.size(); i++) {
            if(_listPhams.get(i).getMa().equals(ma)){
                return i;
            }
        }
        return -3;
    }


}
