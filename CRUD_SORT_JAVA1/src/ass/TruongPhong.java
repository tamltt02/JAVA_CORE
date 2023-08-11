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
public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(String ma, String hoTen, double luong, double luongTrachNhiem) {
        super(ma, hoTen, luong);

        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.println("Luong Trach Nhiem: ");
        luongTrachNhiem = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("-Luong trach nhiem: %f\n", luongTrachNhiem);
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return getLuong() + luongTrachNhiem;
    }

}
