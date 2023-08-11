/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
public class SinhVienBiz extends SinhVien {

    public double keToan;
    public double marketing;
    public double banHang;

    @Override
    public double getdiemTB() {
        return (keToan + marketing + banHang)/3;
    }

}
