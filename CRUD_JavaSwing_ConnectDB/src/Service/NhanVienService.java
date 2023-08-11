/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DBConnect.DbConnect;
import Object.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author ADMIN
 */
public class NhanVienService implements IsService.IsService<NhanVien>{
    List<NhanVien> _listViens;
    DBConnect.DbConnect _dConnect;
    String store = "{call SP_NhanVien(?,?,?,?,?,?,?,?,?,?)}";
    public NhanVienService() {
        _listViens = new ArrayList();
        _dConnect =  new DbConnect();
        getdataQuery();
    }

    @Override
    public String store(NhanVien x, String a) {
       if (x == null) {
            return "Không thành công";
        }
        if (!a.equals("SELECT")) {
            _dConnect.Excute(store, x.getId(), x.getMa(), x.getTenHo(), x.getTenDem(), x.getTen(), x.getGioiTinh(), x.getNgaySinh(), x.getIdCV(), x.getIdNguoiBaoCao(), a);
            getdataQuery();
        return "thành công";

        }
        return "Tb";
    }

    @Override
    public void getdataQuery() {
       try {
            _listViens.removeAll(_listViens);
         ResultSet rs = _dConnect.getdataQuery("SELECT * FROM NhanVien");
            while (rs.next()) {
                _listViens.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),  rs.getString(6), rs.getDate(7), rs.getInt(8), rs.getInt(9)));
            }
          
        } catch (SQLException ex) {
            System.out.println("Lỗi");
        }
    }

    @Override
    public List<NhanVien> getlist() {
       return _listViens;
    }

    @Override
    public List<NhanVien> sort(int temp) {
        if(temp==1){
             _listViens.sort(Comparator.comparing(NhanVien::getMa));
             return _listViens;
         }
         _listViens.sort(Comparator.comparing(NhanVien::getMa).reversed());
         return _listViens; 
    }

    @Override
    public List<NhanVien> find(String a) {
        List<NhanVien> list = new ArrayList();
        for (NhanVien x : _listViens) {
            if(x.getMa().toLowerCase().contains(a.toLowerCase()) || x.getTen().toLowerCase().contains(a.toLowerCase())){
                list.add(x);
            }
        }
        return list;
    }
      public int getIndexByMa(String ma){
        for (int i = 0; i < _listViens.size(); i++) {
            if(_listViens.get(i).getMa().equals(ma)){
                return i;
            }
        }
        return -3;
    }
    
}
