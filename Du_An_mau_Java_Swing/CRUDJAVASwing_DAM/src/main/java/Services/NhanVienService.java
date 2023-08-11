/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repositories.IEdusysRepository;
import Repositories.NhanVienRepository;
import entities.NhanVien;
import java.util.List;
import java.util.ArrayList;
import model.NhanVienModel;

/**
 *
 * @author 
 */
public class NhanVienService implements IEduSysService<NhanVienModel> {

    IEdusysRepository<NhanVien> _iRepositoryNV;
    List<NhanVienModel> listNVModel;

    public NhanVienService() {
        _iRepositoryNV = (IEdusysRepository) Utilities.IoCContainer.getObject(NhanVienRepository.class.toString());
    }

    NhanVien setdata(NhanVienModel nv) {
        NhanVien nv1 = new NhanVien();
        nv1.setMaNV(nv.getmaNV());
        nv1.setMatKhau(nv.getmatKhau());
        nv1.setHoTen(nv.gethoTen());
        nv1.setVaiTro(nv.isvaiTro());
        return nv1;
    }

    @Override
    public String add(NhanVienModel nv) {
        return _iRepositoryNV.them(setdata(nv));
    }

    @Override
    public String update(NhanVienModel nv) {
        return _iRepositoryNV.them(setdata(nv));
    }

    @Override
    public String delete(NhanVienModel nv) {
        return _iRepositoryNV.xoa(setdata(nv));
    }


    @Override
    public List<NhanVienModel> getlist() {
        listNVModel = new ArrayList();
        var getlist = _iRepositoryNV.getDataQuery();
        for (NhanVien x : getlist) {
            listNVModel.add(new NhanVienModel(x.getMaNV(), x.getMatKhau(), x.getHoTen(), x.isVaiTro()));
        }
        return listNVModel;

    }
}
