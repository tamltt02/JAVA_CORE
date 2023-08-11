/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Student> listsv = new ArrayList<>();
        System.out.println("Nhập số sinh viên :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
              Student sv = new Student();
            System.out.println("Mời bạn nhập mã SV:");
            sv.setMa(sc.nextLine());
            System.out.println("Mời bạn nhập ten "+i );
            sv.setTen(sc.nextLine());          
            System.out.println("Mời bạn nhập giới tính:");
            sv.setGioitinh(sc.nextLine());
             System.out.println("Mời bạn nhập địa chỉ:");
            sv.setDiachi(sc.nextLine());
             System.out.println("Mời bạn nhập ngày sinh:");
            sv.setNgaysinh(sc.nextLine());
            System.out.println("Mời bạn nhập email:");
            sv.setEmail(sc.nextLine());
             System.out.println("Mời bạn nhập điểm TB:");
            sv.setDiemTB(Double.parseDouble(sc.nextLine()));
            listsv.add(sv);
        }
        
        for (Student student : listsv) {
            student.xuat();
       }
        System.out.println("Sinh viên được học bổng là:");;
        for (Student sv1 : listsv) {
            if(sv1.getDiemTB() > 8){
                sv1.xuat();
            }
        }
    }
}
