/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
   private String maNV ;
private String	matKhau ;
private String	hoTen ;
private boolean vaiTro;

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }

    public String getmaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getmatKhau() {
        return matKhau;
    }

    public void setmatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isvaiTro() {
        return vaiTro;
    }

    public void setvaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

}
