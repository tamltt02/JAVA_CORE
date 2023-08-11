/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi07;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class myClass {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        int n;        
        System.out.println("Nhập vao số lượng sinh viên : ");
        n = sc.nextInt();        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên " + i + ": ");
            sv.setHoTen(sc.next());  
            System.out.print("Nhập điểm sinh viên: ");
            sv.setDiem(sc.nextDouble());
            System.out.print("Nhập tuổi sinh viên : ");
            sv.setTuoi(sc.nextInt());
            System.out.print("Nhập khoa sinh viên : ");
            sv.setKhoa(sc.next());
        }
        System.out.println("Thông tin Sinh viên : ");
        for (int i = 0; i <= n; i++) {
            System.out.println("Họ Tên sv " +i+" : "  + sv.getHoTen());
            System.out.println("Điểm : " + sv.getDiem());
            System.out.println("Tuổi : " + sv.getTuoi());
            System.out.println("Khoa: " + sv.getKhoa());
        }
    }
    
}
