/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMauCRUD;

/**
 *
 * @author ADMIN
 */
public class ChucVu {
    private int IdChucVu ;
    private String MaChucVu ;
    private String TenChucVu ;

    public ChucVu() {
    }

    public ChucVu(int IdChucVu, String MaChucVu, String TenChucVu) {
        this.IdChucVu = IdChucVu;
        this.MaChucVu = MaChucVu;
        this.TenChucVu = TenChucVu;
    }

    public int getIdChucVu() {
        return IdChucVu;
    }

    public void setIdChucVu(int IdChucVu) {
        this.IdChucVu = IdChucVu;
    }

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "IdChucVu=" + IdChucVu + ", MaChucVu=" + MaChucVu + ", TenChucVu=" + TenChucVu + '}';
    }
    
}
