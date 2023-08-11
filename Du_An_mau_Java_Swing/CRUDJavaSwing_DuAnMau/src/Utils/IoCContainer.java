/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Dao.ChuyenDeDAO;
import Dao.EdusyDAO;
import Dao.HocVienDAO;
import Dao.KhoaHocDAO;
import Dao.NguoiHocDAO;
import Dao.NhanVienDAO;

/**
 *
 * @author ADMIN
 */
public class IoCContainer {

    public static Object getObject(String classname) {
        switch (classname) {
            case "class Dao.NguoiHocDAO":
                EdusyDAO ob = new NguoiHocDAO();
                return ob;
            case "class Dao.ChuyenDeDAO":
                EdusyDAO ob1 = new ChuyenDeDAO();
                return ob1;
            case "class Dao.KhoaHocDAO":
                EdusyDAO ob2 = new KhoaHocDAO();
                return ob2;
            case "class Dao.NhanVienDAO":
                EdusyDAO ob3 = new NhanVienDAO();
                return ob3;
            case "class Dao.HocVienDAO":
                EdusyDAO ob4 = new HocVienDAO();
                return ob4;
        }
        return null;
    }
}
