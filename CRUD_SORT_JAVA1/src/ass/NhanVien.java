/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;

import java.util.Scanner;

/**
 *
 * @author ANPRO
 */
public abstract class NhanVien implements Comparable<NhanVien> {

     String ma, hoTen;
     double luong;

    public abstract double getThuNhap();

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    
    public void nhap(Scanner sc) {

        pattern kt = new pattern();
        do {
            System.out.println("Ho ten: ");
            hoTen = sc.nextLine();
            if (kt.ktTen(hoTen)) {
                break;
            }
            System.out.println("Ho ten khong hop le! Vui long nhap lai ^-^");
        } while (true);
        do {
            System.out.println("ma: ");
            ma = sc.nextLine();
            if (kt.ktMA(ma)) {
                break;
            }
            System.out.println("Ma khong hop le! Vui long nhap lai ^-^");
        } while (true);

        System.out.println("Luong: ");
        luong = sc.nextDouble();

        sc.nextLine();
    }

    public void xuat() {
        System.out.printf("Ma: %s  - Ho ten: %s - Luong: %f - Thu nhap: %f\n", ma, hoTen, luong, getThuNhap());
    }
    @Override
    public int compareTo(NhanVien sc) {
        return this.hoTen.compareTo(sc.hoTen);
    }

}
