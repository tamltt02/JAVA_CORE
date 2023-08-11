/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Utilities.HibernateUtil;
import entities.NhanVien;
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
public class NhanVienRepository implements IEdusysRepository<NhanVien> {

    List<NhanVien> listNV = new ArrayList();

    public NhanVienRepository() {

    }

    @Override
    public List<NhanVien> getDataQuery() {
        listNV.removeAll(listNV);
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM NhanVien";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            listNV = query.getResultList();
        }
        return listNV;
    }

    @Override
    public String them(NhanVien x) {
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
    public String xoa(NhanVien x) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE NhanVien nv WHERE nv.MaNV = :MaNV";
                Query query = session.createQuery(hql);
                query.setParameter("MaNV", x.getMaNV());
                query.executeUpdate();
                trans.commit();
                return "Xóa thành công";
            } catch (Exception e) {
                return "Xóa không thành công";
            }
        }
    }

}
