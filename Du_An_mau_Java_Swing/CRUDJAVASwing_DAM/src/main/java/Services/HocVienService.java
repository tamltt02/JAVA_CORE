/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repositories.HocVienRepository;
import Repositories.IEdusysRepository;
import entities.HocVien;
import java.util.ArrayList;
import java.util.List;
import model.HocVienModel;

/**
 *
 * @author 
 */
public class HocVienService implements IEduSysService<HocVienModel> {

    IEdusysRepository<HocVien> _iRepositoryHV;
    List<HocVienModel> listHVModel ;
    public HocVienService() {
        _iRepositoryHV = (IEdusysRepository) Utilities.IoCContainer.getObject(HocVienRepository.class.toString());
        listHVModel = new ArrayList();
    }

    HocVien setdata(HocVienModel hvModel) {
        HocVien hv1 = new HocVien();
        hv1.setMaHV(hvModel.getMaHV());
        hv1.setNguoihoc(hvModel.getNguoiHoc());
        hv1.setKhoahoc(hvModel.getKhoaHoc());
        hv1.setDiem(hvModel.getDiem());
        return hv1;
    }

    @Override
    public String add(HocVienModel hvModel) {
        return _iRepositoryHV.them(setdata(hvModel));
    }

    @Override
    public String update(HocVienModel hvModel) {
        return _iRepositoryHV.them(setdata(hvModel));
    }

    @Override
    public String delete(HocVienModel hvModel) {
        return _iRepositoryHV.xoa(setdata(hvModel));
    }

    @Override
    public List<HocVienModel> getlist() {
        listHVModel = new ArrayList();
        var getlist = _iRepositoryHV.getDataQuery();
        for (HocVien x : getlist) {
            listHVModel.add(new HocVienModel(x.getMaHV(), x.getKhoahoc(), x.getNguoihoc(),x.getDiem()));
        }
    return listHVModel;
    }
}
