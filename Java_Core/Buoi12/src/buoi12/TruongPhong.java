/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
public class TruongPhong extends NhanVien {

    private double trachnhiem;

    public TruongPhong(double trachnhiem, String hoten, double luong) {
        super(hoten, luong);
        this.trachnhiem = trachnhiem;
    }

    public TruongPhong() {
    }

    public double getTrachnhiem() {
        return trachnhiem;
    }

    public void setTrachnhiem(double trachnhiem) {
        this.trachnhiem = trachnhiem;
    }

    @Override
    double getthunhap() {
        return getLuong() + trachnhiem;
    }

    @Override
    public void xuat() {
        System.out.println("tên:"+getHoten());
        System.out.println("Lương:"+getthunhap());
    }

}
