/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.EdusyDAO;
import Dao.NguoiHocDAO;
import Utils.IoCContainer;
import entities.NguoiHoc;
import java.util.List;
import model.NguoiHocModel;

/**
 *
 * @author ADMIN
 */
public class NguoiHocService implements IsEdusyService<NguoiHocModel>{

    EdusyDAO nhDAO;

    public NguoiHocService() {
        nhDAO = (EdusyDAO) IoCContainer.getObject(NguoiHocDAO.class.toString());
    }

    NguoiHoc setdata(NguoiHocModel cdModel) {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(cdModel.getMaNH());
        nh.setHoTen(cdModel.getHoTen());
        nh.setNgaySinh(cdModel.getNgaySinh());
        nh.setGioiTinh(cdModel.isGioiTinh());
        nh.setDienThoai(cdModel.getDienThoai());
        nh.setEmail(cdModel.getEmail());
        nh.setGhiChu(cdModel.getGhiChu());
        nh.setMaNV(cdModel.getMaNV());
        nh.setNgayDK(cdModel.getNgayDK());
        return nh;
    }

    public void add(NguoiHocModel cdModel) {
        nhDAO.them(setdata(cdModel));
    }

    public void update(NguoiHocModel cdModel) {
        nhDAO.sua(setdata(cdModel));
    }

    public void delete(NguoiHocModel cdModel) {
        nhDAO.xoa(setdata(cdModel));
    }

    public List<NguoiHoc> getlist() {
        return nhDAO.getDataQuery();
    }

    @Override
    public List<NguoiHocModel> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
