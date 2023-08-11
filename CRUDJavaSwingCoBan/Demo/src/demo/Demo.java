/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        QLGiaoVien gv = new QLGiaoVien();
        String input;
        do {
            System.out.println("1.Nhập đối tượng");
            System.out.println("2.Xuât đối tượng");
            System.out.println("3.Xuât đối tượng theo khoảng");
            System.out.println("4.Tìm kiếm theo đối tượng");
            System.out.println("5.Sắp xếp theo tên");
            System.out.println("6.Kế thừa");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn chọn:");
            input = sc.nextLine();
            switch(input){
                case "1":
                    gv.nhapDoituong();
                    break;
                      case "2":
                    gv.xuatDoiTuong();
                    break;
                      case "3":
                    gv.xuattheoKhoang();
                    break;
                      case "4":
                    gv.tim();
                    break;
                      case "5":
                    gv.sapxepGV();
                    break;
                      case "6":
                   GVFply gv1 = new GVFply();
                   gv1.setId(123);
                   gv1.setTen("Thanh Tâm");
                   gv1.setSogioday(75.5);
                   gv1.setNganhday("UDPM");
                   gv1.inraManHinh();
                    break;
                    case "0":
                        System.out.println("Bạn chọn chức năng thoát.");
                    default:
                        System.out.println("Mời bạn chọn lại !!");
            }
        } while (!input.equals("0"));
    }

}
