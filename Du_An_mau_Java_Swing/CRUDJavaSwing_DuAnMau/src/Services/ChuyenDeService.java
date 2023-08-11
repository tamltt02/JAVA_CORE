/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.ChuyenDeDAO;
import Dao.EdusyDAO;
import Dao.NguoiHocDAO;
import Utils.IoCContainer;
import entities.ChuyenDe;
import java.util.List;
import model.ChuyenDeModel;

/**
 *
 * @author ADMIN
 */
public class ChuyenDeService implements IsEdusyService<ChuyenDeModel>{

    EdusyDAO cdDAO;

    public ChuyenDeService() {
        cdDAO = (EdusyDAO) IoCContainer.getObject(ChuyenDeDAO.class.toString());
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

    public void add(ChuyenDeModel cdModel) {
        cdDAO.them(setdata(cdModel));
    }

    public void update(ChuyenDeModel cdModel) {
        cdDAO.sua(setdata(cdModel));
    }

    public void delete(ChuyenDeModel cdModel) {
        cdDAO.xoa(setdata(cdModel));
    }

    public List<ChuyenDe> getlist() {
        return cdDAO.getDataQuery();
    }

    @Override
    public List<ChuyenDeModel> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
