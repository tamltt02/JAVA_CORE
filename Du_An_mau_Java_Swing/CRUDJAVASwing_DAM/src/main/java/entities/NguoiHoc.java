/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "NguoiHoc")
public class NguoiHoc implements Serializable {

    @Id
    private String MaNH;

    @Column
    private String HoTen;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date NgaySinh;

    @Column
    private boolean GioiTinh;

    @Column
    private String DienThoai;

    @Column
    private String Email;

    @Column
    private String GhiChu;

    @ManyToOne
    @JoinColumn(name = "MaNV")
    private NhanVien nhanvien;

    @Column
    private Date ngayDK;
    
    @OneToMany(mappedBy = "nguoihoc",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HocVien> hocvien;

    public NguoiHoc() {
    }

    public NguoiHoc(String MaNH, String HoTen, Date NgaySinh, boolean GioiTinh, String DienThoai, String Email, String GhiChu, NhanVien nhanvien, Date ngayDK, List<HocVien> hocvien) {
        this.MaNH = MaNH;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DienThoai = DienThoai;
        this.Email = Email;
        this.GhiChu = GhiChu;
        this.nhanvien = nhanvien;
        this.ngayDK = ngayDK;
        this.hocvien = hocvien;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public List<HocVien> getHocvien() {
        return hocvien;
    }

    public void setHocvien(List<HocVien> hocvien) {
        this.hocvien = hocvien;
    }

}
