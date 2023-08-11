/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "ChuyenDe")
public class ChuyenDe implements Serializable {

    @Id
    private String MaCD;
    @Column
    private String TenCD;

    @Column
    private double HocPhi;

    @Column
    private int ThoiLuong;

    @Column
    private String Hinh;

    @Column
    private String MoTa;

   @OneToMany(mappedBy="chuyende", 
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<KhoaHoc> khoahoc;
    public ChuyenDe() {
    }

    public ChuyenDe(String MaCD, String TenCD, double HocPhi, int ThoiLuong, String Hinh, String MoTa, List<KhoaHoc> khoahoc) {
        this.MaCD = MaCD;
        this.TenCD = TenCD;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.Hinh = Hinh;
        this.MoTa = MoTa;
        this.khoahoc = khoahoc;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public String getTenCD() {
        return TenCD;
    }

    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public List<KhoaHoc> getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(List<KhoaHoc> khoahoc) {
        this.khoahoc = khoahoc;
    }
    

}
