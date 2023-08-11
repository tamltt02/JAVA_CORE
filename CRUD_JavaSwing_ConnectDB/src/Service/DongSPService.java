/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DBConnect.DbConnect;
import Object.DongSP;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DongSPService implements IsService.IsService<DongSP>{
     List<DongSP> _lDongSPs ;
  DBConnect.DbConnect _dbConnect;
    Statement statement= null;
    final String store = "{call SP_DongSP(?,?,?,?,?)}";
    public DongSPService() {
        _lDongSPs = new ArrayList();
        _dbConnect = new DbConnect();
        getdataQuery();
        
    }
    
    
    @Override
    public void getdataQuery(){
        try {
            _lDongSPs.removeAll(_lDongSPs);
            ResultSet rs = _dbConnect.getdataQuery("select * from DongSanPham");
            while (rs.next()) {
                _lDongSPs.add(new DongSP(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi rồi");
        }
    }
     public int getIndexByMa(String ma){
        for (int i = 0; i < _lDongSPs.size(); i++) {
            if(_lDongSPs.get(i).getMa().equals(ma)){
                return i;
            }
        }
        return -3;
    }

    @Override
    public String store(DongSP x, String a) {
       if(!a.equals("SELECT")){
            _dbConnect.Excute(store,x.getId(),x.getMa(),x.getTen(),x.getWeb() ,a);
            getdataQuery();
        }
        return a+"Thành công";
    }

    @Override
    public List<DongSP> getlist() {
         return _lDongSPs;
    }

    @Override
    public List<DongSP> sort(int temp) {
         if(temp==1){
             _lDongSPs.sort(Comparator.comparing(DongSP::getMa));
             return _lDongSPs;
         }
         _lDongSPs.sort(Comparator.comparing(DongSP::getMa).reversed());
         return _lDongSPs;  
    }

    @Override
    public List<DongSP> find(String a) {
       List<DongSP> list = new ArrayList();
        for (DongSP x : _lDongSPs) {
            if(x.getMa().toLowerCase().contains(a.toLowerCase()) || x.getTen().toLowerCase().contains(a.toLowerCase())){
                list.add(x);
            }
        }
        return list;
    }
}
