/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Utilities.HibernateUtil;
import entities.ChuyenDe;
import entities.NguoiHoc;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author 
 */
public class NguoiHocRepository implements IEdusysRepository<NguoiHoc> {

    List<NguoiHoc> listNH = new ArrayList();

    public NguoiHocRepository() {

    }

    @Override
    public List<NguoiHoc> getDataQuery() {
        listNH.removeAll(listNH);
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM NguoiHoc";
            TypedQuery<NguoiHoc> query = session.createQuery(hql, NguoiHoc.class);
            listNH = query.getResultList();
        }
        return listNH;
    }

    @Override
    public String them(NguoiHoc x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
                session.saveOrUpdate(x);
                trans.commit();
                return "Thành công";
            } catch (Exception e) {
                e.printStackTrace();
                x = null;
                return " Không thành công";
            }
    }

    @Override
    public String xoa(NguoiHoc x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE NguoiHoc nh WHERE nh.MaNH = :MaNH";
                Query query = session.createQuery(hql);
                query.setParameter("MaNH", x.getMaNH());
                query.executeUpdate();
                trans.commit();
                return "Xóa thành công!";
            } catch (Exception e) {
                return "Xóa không thành công ";
            }
        }
    }

}
