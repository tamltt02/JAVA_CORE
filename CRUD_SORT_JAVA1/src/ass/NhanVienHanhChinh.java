/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;


/**
 *
 * @author ADMIN
 */
public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh() {

    }

    public NhanVienHanhChinh(String ma, String hoTen, double luong) {
        super(ma, hoTen, luong);
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }

}
