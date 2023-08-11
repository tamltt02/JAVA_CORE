/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.EdusyDAO;
import Dao.NhanVienDAO;
import Utils.IoCContainer;
import entities.NhanVien;
import java.util.List;
import model.NhanVienModel;

/**
 *
 * @author ADMIN
 */
public class NhanVienServices implements IsEdusyService<NhanVienModel>{

    EdusyDAO nvDao;

    public NhanVienServices() {
        nvDao = (EdusyDAO) (EdusyDAO) IoCContainer.getObject(NhanVienDAO.class.toString());
    }

    NhanVien setdata(NhanVienModel nv) {
        NhanVien nv1 = new NhanVien();
        nv1.setmaNV(nv.getmaNV());
        nv1.setmatKhau(nv.getmatKhau());
        nv1.sethoTen(nv.gethoTen());
        nv1.setvaiTro(nv.isvaiTro());
        return nv1;
    }

    public void add(NhanVienModel nv) {
        nvDao.them(setdata(nv));
    }

    public void update(NhanVienModel nv) {
        nvDao.sua(setdata(nv));
    }

    public void delete(NhanVienModel nv) {
        nvDao.xoa(setdata(nv));
    }

    public List<NhanVien> getlist() {
        return nvDao.getDataQuery();
    }

    @Override
    public List<NhanVienModel> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
