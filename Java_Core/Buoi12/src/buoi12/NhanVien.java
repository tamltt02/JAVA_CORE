/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String hoten ;
    private double luong;

    public NhanVien(String hoten, double luong) {
        this.hoten = hoten;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    double getthunhap(){
        return luong ;
    }
    public void xuat(){
        System.out.println("tên:"+hoten);
        System.out.println("Lương:"+getthunhap());
    }
}
