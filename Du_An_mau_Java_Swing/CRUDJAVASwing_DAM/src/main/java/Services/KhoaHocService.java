/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repositories.IEdusysRepository;
import Repositories.KhoaHocRepository;
import entities.KhoaHoc;
import java.util.List;
import java.util.ArrayList;
import model.KhoaHocModel;

/**
 *
 * @author 
 */
public class KhoaHocService implements IEduSysService<KhoaHocModel> {

    IEdusysRepository<KhoaHoc> _iRepositoryKH;
    List<KhoaHocModel> listKHModel;

    public KhoaHocService() {
        _iRepositoryKH = (IEdusysRepository) Utilities.IoCContainer.getObject(KhoaHocRepository.class.toString());
    }

    KhoaHoc setdata(KhoaHocModel khModel) {
        KhoaHoc kh = new KhoaHoc();
        kh.setMaKH(khModel.getMaKH());
        kh.setChuyende(khModel.getChuyenDe());
        kh.setHocPhi(khModel.getHocPhi());
        kh.setThoiLuong(khModel.getThoiLuong());
        kh.setNgayKG(khModel.getNgayKG());
        kh.setGhiChu(khModel.getGhiChu());
        kh.setNhanvien(khModel.getNhanvien());
        kh.setNgayTao(khModel.getNgayTao());

        return kh;

    }

    @Override
    public String add(KhoaHocModel khModel) {
        setdata(khModel).setMaKH(0);
        return _iRepositoryKH.them(setdata(khModel));
    }

    @Override
    public String update(KhoaHocModel khModel) {
        return _iRepositoryKH.them(setdata(khModel));
    }

    @Override
    public String delete(KhoaHocModel khModel) {
        return _iRepositoryKH.xoa(setdata(khModel));
    }


    @Override
    public List<KhoaHocModel> getlist() {
       listKHModel = new ArrayList();
        var getlist = _iRepositoryKH.getDataQuery();
        for (KhoaHoc x : getlist) {
            listKHModel.add(new KhoaHocModel(x.getMaKH(), x.getChuyende(), x.getHocPhi(), x.getThoiLuong(), x.getNgayKG(), x.getGhiChu(), x.getNhanvien(), x.getNgayTao()));
        }
    return listKHModel;
    }
}
