/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Utilities.HibernateUtil;
import entities.ChuyenDe;
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
public class ChuyenDeRepository implements IEdusysRepository<ChuyenDe> {

    List<ChuyenDe> listCD = new ArrayList();

    public ChuyenDeRepository() {
       
    }

    @Override
    public List<ChuyenDe> getDataQuery() {
        listCD.removeAll(listCD);
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM ChuyenDe";
            TypedQuery<ChuyenDe> query = session.createQuery(hql, ChuyenDe.class);
            listCD = query.getResultList();
            
        }
        return listCD;
    }

    @Override
    public String them(ChuyenDe x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
                session.saveOrUpdate(x);
                trans.commit();
                return "Thành công !";
            } catch (Exception e) {
                e.printStackTrace();
                x = null;
                return "Không thành công !";
            }
    }

    @Override
    public String xoa(ChuyenDe x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE ChuyenDe cd WHERE cd.MaCD = :MaCD";
                Query query = session.createQuery(hql);
                query.setParameter("MaCD", x.getMaCD());
                query.executeUpdate();
                trans.commit();
                return "Xóa thành công !";
            } catch (Exception e) {
                return "Xóa không thành công !";
            }
        }
    }

}
