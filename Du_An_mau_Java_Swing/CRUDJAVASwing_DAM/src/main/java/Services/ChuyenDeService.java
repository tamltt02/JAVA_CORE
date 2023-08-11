/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repositories.ChuyenDeRepository;
import Repositories.IEdusysRepository;
import entities.ChuyenDe;
import java.util.List;
import java.util.ArrayList;
import model.ChuyenDeModel;

/**
 *
 * @author 
 */
public class ChuyenDeService implements IEduSysService<ChuyenDeModel> {

    IEdusysRepository<ChuyenDe> _iRepositoryCD;
    List<ChuyenDeModel> listCDModel;

    public ChuyenDeService() {
        _iRepositoryCD = (IEdusysRepository) Utilities.IoCContainer.getObject(ChuyenDeRepository.class.toString());
        
    }

    ChuyenDe setdata(ChuyenDeModel cdModel) {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(cdModel.getMaCD());
        cd.setTenCD(cdModel.getTenCD());
        cd.setHocPhi(cdModel.getHocPhi());
        cd.setThoiLuong(cdModel.getThoiLuong());
        cd.setHinh(cdModel.getHinh());
        cd.setMoTa(cdModel.getMoTa());
        return cd;

    }

    @Override
    public String add(ChuyenDeModel cdModel) {
        return _iRepositoryCD.them(setdata(cdModel));
    }

    @Override
    public String update(ChuyenDeModel cdModel) {
        return _iRepositoryCD.them(setdata(cdModel));
    }

    @Override
    public String delete(ChuyenDeModel cdModel) {
        return _iRepositoryCD.xoa(setdata(cdModel));
    }


    @Override
    public List<ChuyenDeModel> getlist() {
        listCDModel = new ArrayList();
        var getlist = _iRepositoryCD.getDataQuery();
        for (ChuyenDe x : getlist) {
            listCDModel.add(new ChuyenDeModel(x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getHinh(), x.getMoTa()));
        }
    return listCDModel;
    }
}
