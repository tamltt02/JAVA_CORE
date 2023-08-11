/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import DBConnect.DbConnect;
import Object.ChucVu;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class CVservice implements IsService.IsService<ChucVu>{
    DBConnect.DbConnect _dConnect;
    List<ChucVu> _listChucVus;
    ResultSet rs = null;
    String store = "{call SP_ChucVu(?,?,?,?)}";

    public CVservice() {
        _listChucVus = new ArrayList();
        _dConnect = new DbConnect();
        getdataQuery();
    }

    @Override
    public String store(ChucVu x, String a) {
        if (!a.equals("SELECT")) {
//            if (getIndexByMa(x.getMa()) != -3) {
//                return "Trùng mã";
//            }
            _dConnect.Excute(store, x.getId(), x.getMa(), x.getTen(), a);
            getdataQuery();
             return a + "Thành công";
        }
        return"Thành công";
    }

    @Override
    public void getdataQuery() {
       try {
            _listChucVus.removeAll(_listChucVus);
            ResultSet rs = _dConnect.getdataQuery("SELECT * FROM ChucVu");
            while (rs.next()) {
                _listChucVus.add(new ChucVu(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CVservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ChucVu> getlist() {
        return _listChucVus;
    }

    @Override
    public List sort(int temp) {
        if(temp==1){
             _listChucVus.sort(Comparator.comparing(ChucVu::getMa));
             return _listChucVus;
         }
         _listChucVus.sort(Comparator.comparing(ChucVu::getMa).reversed());
         return _listChucVus;  
    }

    @Override
    public List find(String a) {
        List<ChucVu> list = new ArrayList();
        for (ChucVu x : _listChucVus) {
            if(x.getMa().toLowerCase().contains(a.toLowerCase()) || x.getTen().toLowerCase().contains(a.toLowerCase())){
                list.add(x);
            }
        }
        return list;
    }

    public int getIndexByMa(String maCV){
        for (int i = 0; i < _listChucVus.size(); i++) {
            if(_listChucVus.get(i).getMa().equals(maCV)){
                return i;
            }
        }
        return -3;
    }

   


    
}