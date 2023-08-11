

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import entities.NhanVien;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN
 */
public class NewClass {
    public static void main(String[] args) {
        try (Session s = HibernateUtil.getSessionFactory().openSession()) {
            Query<NhanVien> q = s.createQuery("from NhanVien");
            
            List<NhanVien> nv = q.list();
            nv.forEach(x -> System.out.println(x.getHoTen()));
        }
    }
}
