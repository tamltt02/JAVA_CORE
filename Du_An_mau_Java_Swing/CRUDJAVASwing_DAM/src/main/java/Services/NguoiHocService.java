/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repositories.IEdusysRepository;
import Repositories.NguoiHocRepository;
import entities.NguoiHoc;
import java.util.List;
import java.util.ArrayList;
import model.NguoiHocModel;

/**
 *
 * @author 
 */
public class NguoiHocService implements IEduSysService<NguoiHocModel> {

    IEdusysRepository<NguoiHoc> _iRepositoryNH;
    List<NguoiHocModel> listNHModel ;
    public NguoiHocService() {
        _iRepositoryNH = (IEdusysRepository) Utilities.IoCContainer.getObject(NguoiHocRepository.class.toString());
    }

    NguoiHoc setdata(NguoiHocModel nhModel) {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(nhModel.getMaNH());
        nh.setHoTen(nhModel.getHoTen());
        nh.setNgaySinh(nhModel.getNgaySinh());
        nh.setGioiTinh(nhModel.isGioiTinh());
        nh.setDienThoai(nhModel.getDienThoai());
        nh.setEmail(nhModel.getEmail());
        nh.setGhiChu(nhModel.getGhiChu());
        nh.setNhanvien(nhModel.getNhanVien());
        nh.setNgayDK(nhModel.getNgayDK());
        return nh;
    }

    @Override
    public String add(NguoiHocModel nhModel) {
      return _iRepositoryNH.them(setdata(nhModel));
    }

    @Override
    public String update(NguoiHocModel nhModel) {
       return _iRepositoryNH.them(setdata(nhModel));
    }

    @Override
    public String delete(NguoiHocModel nhModel) {
     return  _iRepositoryNH.xoa(setdata(nhModel));
    }

    @Override
    public List<NguoiHocModel> getlist() {
       listNHModel = new ArrayList();
        var getlist = _iRepositoryNH.getDataQuery();
        for (NguoiHoc x : getlist) {
            listNHModel.add(new NguoiHocModel(x.getMaNH(), x.getHoTen(), x.getNgaySinh(), x.isGioiTinh(), x.getDienThoai(), x.getEmail(), x.getGhiChu(), x.getNhanvien(), x.getNgayDK()));
        }
        return listNHModel;
    }
}
