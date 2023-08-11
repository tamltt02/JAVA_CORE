/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Utilities.HibernateUtil;
import entities.HocVien;
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
public class HocVienRepository implements IEdusysRepository<HocVien> {

    List<HocVien> listHV = new ArrayList();

    public HocVienRepository() {

    }

    @Override
    public List<HocVien> getDataQuery() {
        listHV.removeAll(listHV);
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM HocVien";
            TypedQuery<HocVien> query = session.createQuery(hql, HocVien.class);
            listHV = query.getResultList();
        }
        return listHV;
    }

    @Override
    public String them(HocVien x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
                session.saveOrUpdate(x);
                trans.commit();
                return "Thành công";
            } catch (Exception e) {
                e.printStackTrace();
                x = null;
                return "Không Thành công";
            }
    }

    @Override
    public String xoa(HocVien x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE HocVien hv WHERE hv.MaHV = :MaHV";
                Query query = session.createQuery(hql);
                query.setParameter("MaHV", x.getMaHV());
                query.executeUpdate();
                trans.commit();
                return "Xóa thành công";
            } catch (Exception e) {
                return "Xóa không thành công";

            }
        }
    }

}
