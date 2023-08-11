/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
public class LaoCong extends NhanVien{
    private double sogiolam;

    public LaoCong(double sogiolam, String hoten, double luong) {
        super(hoten, luong);
        this.sogiolam = sogiolam;
    }

    public double getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(double sogiolam) {
        this.sogiolam = sogiolam;
    }


    @Override
    double getthunhap() {
        return getLuong() * sogiolam;
    }

    @Override
    public void xuat() {
         System.out.println("tên:"+getHoten());
        System.out.println("Lương:"+getthunhap());
    }
   
}
