/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASSIGNMENT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class ContactService implements IConTactService {

    List<PerSonContact> _lstContacts;
    Utilities _utilities;

    public ContactService() {
        _lstContacts = new ArrayList<PerSonContact>();
        _utilities = new Utilities();
    }

    @Override
    public void fakeData() {
        _lstContacts.add(new PerSonContact("0816134100", "0816452224", "Thanhtam@gmail.com", "", 1, "Tâm", "Thanh", "Lê", "2002", 1));
        _lstContacts.add(new PerSonContact("0816552554", "0816445224", "Anhdao@gmail.com", "", 2, "Dung", "Anh", "Trương", "2002", 1));
        _lstContacts.add(new PerSonContact("0816485856", "0878952224", "Ngocha@gmail.com", "", 3, "Hà", "Ngọc", "Trần", "2002", 1));
        _lstContacts.add(new PerSonContact("0348333900", "0335728316", "Lesang@gmail.com", "", 4, "Sáng", "Văn", "Lê", "1999", 0));
        _lstContacts.add(new PerSonContact("0485952226", "0814845524", "Leanh@gmail.com", "", 5, "Anh", "Thị", "Lê", "2002", 1));
    }

    @Override
    public String add(PerSonContact ct) {
        if (ct == null) {
            return "Không thành công";
        }
        _lstContacts.add(ct);
        return "Thêm thành công";
    }

    @Override
    public String edit(PerSonContact ct) {
        int index = getIndexByID(ct.getId());
        if (index == -1) {
            return "Không tim thay";
        }
        _lstContacts.get(index).setTen(ct.getTen());
        _lstContacts.get(index).setHo(ct.getHo());
        _lstContacts.get(index).setTenDem(ct.getTenDem());
        _lstContacts.get(index).setSdt1(ct.getSdt1());
        _lstContacts.get(index).setSdt2(ct.getSdt2());
        _lstContacts.get(index).setEmail(ct.getEmail());
        _lstContacts.get(index).setGhiChu(ct.getGhiChu());
        _lstContacts.get(index).setNamSinh(ct.getNamSinh());
        _lstContacts.get(index).setGioiTinh(ct.getGioiTinh());

        return "Sửa thành công";

    }

    @Override
    public String delete(int id) {
        int index = getIndexByID(id);
        if (index == -1) {
            return "Không thanh cong";

        }
        _lstContacts.remove(index);
        return "Xóa thành công";
    }


    @Override
    public List<PerSonContact> getlstContact() {
        return _lstContacts;
    }

    @Override
    public int getIndexByID(int id) {
        for (int i = 0; i < _lstContacts.size(); i++) {
            if (_lstContacts.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int getMaxID() {
        if (_lstContacts.isEmpty()) {
            return 1;
        }
        int max = _lstContacts.get(0).getId();
        for (PerSonContact x : _lstContacts) {
            if (max < x.getId()) {
                max = x.getId();
            }
        }
        return max + 1;
    }

    @Override
    public String ghiFile(String txt) {
        try {
            File file = new File(txt);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);  
            for (PerSonContact x : _lstContacts) {
                oos.writeObject(x);
                
            }
            oos.close();
            fos.close();
            return"Ghi thành công" ;
        } catch (IOException iOException) {
            return "Lưu file không tc";
        }
    }

    @Override
    public String docFile(String txt) {
        try {
            File file = new File(txt);
            if(!file.exists()){
                return "Khong thay";
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available() > 0){
                var temp = ois.readObject();
                _lstContacts.add((PerSonContact) temp);
            }
            for (PerSonContact x : _lstContacts) {
              
            }
            ois.close();
            fis.close();
            return "Doc file tc";
        } catch (Exception e) {
            return "Doc file k tc";
        }
    }

    @Override
    public List<PerSonContact> findTheoNguoi(String txt) {
       var listnew = new ArrayList<PerSonContact>();
        for (PerSonContact x : _lstContacts) {
            if(x.getHo().toLowerCase().contains(txt.toLowerCase()) || x.getTenDem().toLowerCase().contains(txt.toLowerCase()) || x.getTen().toLowerCase().contains(txt.toLowerCase()) ){
                listnew.add(x);
            }
        }
        return listnew;
    }

    @Override
    public List<PerSonContact> findTheoTen(String txt) {
          var listnew = new ArrayList<PerSonContact>();
        for (PerSonContact x : _lstContacts) {
            if(x.getTen().toLowerCase().contains(txt.toLowerCase()) ){
                listnew.add(x);
            }
        }
        return listnew;
    }

    @Override
    public List<PerSonContact> findTheosdt(String txt) {
         var listnew = new ArrayList<PerSonContact>();
        for (PerSonContact x : _lstContacts) {
            if(x.getSdt1().startsWith(txt) || x.getSdt2().startsWith(txt) ){
                listnew.add(x);
            }
        }
        return listnew;
    }

    @Override
    public List<PerSonContact> sortAZ() {
       _lstContacts.sort(Comparator.comparing(PerSonContact::getTen));
       return _lstContacts;
    }

    @Override
    public List<PerSonContact> sortZA() {
       _lstContacts.sort((o1, o2) -> o2.getTen().compareTo(o1.getTen()));
       return _lstContacts;
    }

}
