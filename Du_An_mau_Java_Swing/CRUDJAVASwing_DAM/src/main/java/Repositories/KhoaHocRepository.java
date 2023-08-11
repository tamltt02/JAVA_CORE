/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Utilities.HibernateUtil;
import entities.KhoaHoc;
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
public class KhoaHocRepository implements IEdusysRepository<KhoaHoc> {

    List<KhoaHoc> listKH = new ArrayList();

    public KhoaHocRepository() {

    }

    @Override
    public List<KhoaHoc> getDataQuery() {
        listKH.removeAll(listKH);
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM KhoaHoc";
            TypedQuery<KhoaHoc> query = session.createQuery(hql, KhoaHoc.class);
            listKH = query.getResultList();
        }
        return listKH;
    }

    @Override
    public String them(KhoaHoc x) {
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
    public String xoa(KhoaHoc x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE KhoaHoc kh WHERE kh.MaKH = :MaKH";
                Query query = session.createQuery(hql);
                query.setParameter("MaKH", x.getMaKH());
                query.executeUpdate();
                trans.commit();
                return " Xóa thành công";
            } catch (Exception e) {
                return " Xóa không thành công";

            }
        }
    }

}
