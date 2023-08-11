/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Repositories.ChuyenDeRepository;
import Repositories.HocVienRepository;
import Repositories.IEdusysRepository;
import Repositories.KhoaHocRepository;
import Repositories.NguoiHocRepository;
import Repositories.NhanVienRepository;


/**
 *
 * @author ADMIN
 */
public class IoCContainer {

    public static Object getObject(String classname) {
        switch (classname) {
            case "class Repositories.NhanVienRepository":
                IEdusysRepository ob = new NhanVienRepository();
                return ob;
            case "class Repositories.ChuyenDeRepository":
                IEdusysRepository ob1 = new ChuyenDeRepository();
                return ob1;
            case "class Repositories.KhoaHocRepository":
                IEdusysRepository ob2 = new KhoaHocRepository();
                return ob2;
            case "class Repositories.NguoiHocRepository":
                IEdusysRepository ob3 = new NguoiHocRepository();
                return ob3;
            case "class Repositories.HocVienRepository":
                IEdusysRepository ob4 = new HocVienRepository();
                return ob4;
                
        }
        return null;
    }
}
