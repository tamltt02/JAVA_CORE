/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.EdusyDAO;
import Dao.HocVienDAO;
import Utils.IoCContainer;
import entities.HocVien;
import java.util.List;
import model.HocVienModel;

/**
 *
 * @author ADMIN
 */
public class HocVienService implements IsEdusyService<HocVienModel> {

    EdusyDAO hvDAO;

    public HocVienService() {
        hvDAO = (EdusyDAO) IoCContainer.getObject(HocVienDAO.class.toString());

    }

    HocVien setdata(HocVienModel hv) {
        HocVien hv1 = new HocVien();
        hv1.setMaHV(hv.getMaHV());
        hv1.setMaKH(hv.getMaKH());
        hv1.setMaNH(hv.getMaNH());
        hv1.setDiem(hv.getDiem());
        return hv1;
    }

    @Override
    public void add(HocVienModel x) {
        hvDAO.them(setdata(x));
    }

    @Override
    public void update(HocVienModel x) {
        hvDAO.sua(setdata(x));
    }

    @Override
    public void delete(HocVienModel x) {
        hvDAO.xoa(setdata(x));
    }

    public List<HocVien> getlist() {
        return hvDAO.getDataQuery();
    }

    @Override
    public List<HocVienModel> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
