/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.EdusyDAO;
import Dao.KhoaHocDAO;
import Utils.IoCContainer;
import entities.KhoaHoc;
import java.util.List;
import model.KhoaHocModel;

/**
 *
 * @author ADMIN
 */
public class KhoaHocService implements IsEdusyService<KhoaHocModel>{

    EdusyDAO<KhoaHoc> khDAO;

    public KhoaHocService() {
       khDAO = (EdusyDAO) IoCContainer.getObject(KhoaHocDAO.class.toString());
        
    }

    KhoaHoc setdata(KhoaHocModel cdModel) {
        KhoaHoc kh = new KhoaHoc();
        kh.setMaKH(cdModel.getMaKH());
        kh.setMaCD(cdModel.getMaCD());
        kh.setHocPhi(cdModel.getHocPhi());
        kh.setThoiLuong(cdModel.getThoiLuong());
        kh.setNgayKG(cdModel.getNgayKG());
        kh.setGhiChu(cdModel.getGhiChu());
        kh.setMaNV(cdModel.getMaNV());
        kh.setNgayDK(cdModel.getNgayDK());

        return kh;
    }

    public void add(KhoaHocModel cdModel) {
        khDAO.them(setdata(cdModel));
    }

    public void update(KhoaHocModel cdModel) {
        khDAO.sua(setdata(cdModel));
    }

    public void delete(KhoaHocModel cdModel) {
        khDAO.xoa(setdata(cdModel));
    }

    public List<KhoaHoc> getlist() {
        return khDAO.getDataQuery();
    }

    @Override
    public List<KhoaHocModel> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
