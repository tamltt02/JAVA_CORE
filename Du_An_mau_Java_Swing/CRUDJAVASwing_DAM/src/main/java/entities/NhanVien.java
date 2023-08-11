/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
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
@Table(name = "NhanVien")
public class NhanVien implements Serializable{

    @Id
    private String MaNV;

    @Column
    private String MatKhau;

    @Column
    private String HoTen;

    @Column
    private boolean VaiTro;
    
     @OneToMany(mappedBy="nhanvien", 
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<NguoiHoc> nguoihoc;
   
      @OneToMany(mappedBy="nhanvien", 
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<KhoaHoc> khoahoc;
    public NhanVien() {
    }

    public NhanVien(String MaNV, String MatKhau, String HoTen, boolean VaiTro, List<NguoiHoc> nguoihoc, List<KhoaHoc> khoahoc) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.VaiTro = VaiTro;
        this.nguoihoc = nguoihoc;
        this.khoahoc = khoahoc;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public List<NguoiHoc> getNguoihoc() {
        return nguoihoc;
    }

    public void setNguoihoc(List<NguoiHoc> nguoihoc) {
        this.nguoihoc = nguoihoc;
    }

    public List<KhoaHoc> getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(List<KhoaHoc> khoahoc) {
        this.khoahoc = khoahoc;
    }


    
    
}
