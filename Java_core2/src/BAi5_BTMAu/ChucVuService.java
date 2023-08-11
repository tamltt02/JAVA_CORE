    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAi5_BTMAu;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ChucVuService {

    /*
    Phần 1: Khai báo biến toàn cục có dấu _
     */
    List<ChucVu> _lstChucVu;
    DBconnection _dBconnection;
    ResultSet _rs = null;
    Statement _st = null;
    ChucVu _cv;

    public ChucVuService() {
        try {
            _lstChucVu = new ArrayList<>();
            _dBconnection = new DBconnection();
            getlstChucVuFormDb();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Phần 2: triển khai các chức 

    public List<ChucVu> getLstChucVu() {
        return _lstChucVu;
    }

    public String add(ChucVu cv) {
        if (cv == null) {
            return "Không tc";
        }
        try {
            return insertChucVuToDB(cv);
        } catch (SQLException ex) {
            return "Ktc";
        }
    }
    
    public String update(ChucVu cv){
        if(getIndexByMa(cv.getMa()) == -3){
            return "Khong tc";
        }
        try {
            return updateChucVuToDB(cv);
        } catch (SQLException ex) {
            return "Ktc";
        }
      
    }
    
     public String delete(ChucVu cv){
        if(getIndexByMa(cv.getMa()) == -3){
            return "Khong tc";
        }
        try {
            return deleteChucVuToDB(cv);
        } catch (SQLException ex) {
            return "Ktc";
        }
        
    }
     
    
    
     public List<ChucVu> sort(int temp){// 1. asc, 2. desc
         if(temp==1){
             _lstChucVu.sort(Comparator.comparing(ChucVu::getMa));
             return _lstChucVu;
         }
         _lstChucVu.sort(Comparator.comparing(ChucVu::getMa).reversed());
         return _lstChucVu;      
     }

      public List<ChucVu> find(String ten){
           List<ChucVu> _lt = new ArrayList();
           for (ChucVu cv : _lstChucVu) {
              if(cv.getMa().toLowerCase().contains(ten.toLowerCase()) || cv.getTen().toLowerCase().contains(ten.toLowerCase())){
                  _lt.add(cv);
              }
          }
           return _lt;
     }
     
     
    // phần 3: triển lhia pt lquan đến db
    public void getlstChucVuFormDb() throws SQLException {
        _lstChucVu = new ArrayList();
        String select = "Select * from ChucVu";
        _st = DBconnection.openDbConnection().createStatement();
        _rs = _st.executeQuery(select);// Thực thi câu truy vấn
        while (_rs.next()) {
            _lstChucVu.add(new ChucVu(_rs.getInt(1), _rs.getString(2), _rs.getString(3)));
        }// Đổ từng dùng vào list
        _st.close();
    }

    public String insertChucVuToDB(ChucVu cv) throws SQLException {
        if(getIndexByMa(cv.getMa()) != -3){
            return "Trung ma";
        }
        _st = DBconnection.openDbConnection().createStatement();
        //vì cơ sở dữ liệu để id tự tăng nên k cần truyền iD
        String insert = "INSERT INTO[ChucVu] ([Ma],[Ten])" + "Values('" + cv.getMa()+ "','" + cv.getTen()+"')";
        _st.executeUpdate(insert);
        return "Thêm vào db thành công";
    }
    // update
    public String updateChucVuToDB(ChucVu cv) throws SQLException {
        _st = _dBconnection.openDbConnection().createStatement();
       String update = "UPDATE [ChucVu] SET [Ten] = '"+cv.getTen()+"' WHERE [Ma]='"+cv.getMa()+"'";
       _st.executeUpdate(update);
       return "Sửa vào DB thành công";
    }
    
    // delete
    public String deleteChucVuToDB(ChucVu cv) throws SQLException {
        _st = _dBconnection.openDbConnection().createStatement();
       String delete = "DELETE FROM [ChucVu] WHERE [Ma]='"+cv.getMa()+"'";
       _st.executeUpdate(delete);
       return "Xoá vào DB thành công";
    }
    
    //Viết check trùng
    public int getIndexByMa(String maCV){
        for (int i = 0; i < _lstChucVu.size(); i++) {
            if(_lstChucVu.get(i).getMa().equals(maCV)){
                return i;
            }
        }
        return -3;
    }
    
}
