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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "KhoaHoc")
public class KhoaHoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaKH;

    @Column
    private float HocPhi;

    @Column
    private int ThoiLuong;
            
    @Column
    private Date NgayKG;

    @Column
    private String GhiChu;

    @Column
    private Date NgayTao;

    @ManyToOne
    @JoinColumn(name = "MaNV")
    private NhanVien nhanvien;

    @ManyToOne
    @JoinColumn(name = "MaCD")
    private ChuyenDe chuyende;

    @OneToMany(mappedBy="khoahoc", 
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HocVien> hocvien;
    public KhoaHoc() {
    }

    public KhoaHoc(int MaKH, float HocPhi, int ThoiLuong, Date NgayKG, String GhiChu, Date NgayTao, NhanVien nhanvien, ChuyenDe chuyende, List<HocVien> hocvien) {
        this.MaKH = MaKH;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.NgayKG = NgayKG;
        this.GhiChu = GhiChu;
        this.NgayTao = NgayTao;
        this.nhanvien = nhanvien;
        this.chuyende = chuyende;
        this.hocvien = hocvien;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public Date getNgayKG() {
        return NgayKG;
    }

    public void setNgayKG(Date NgayKG) {
        this.NgayKG = NgayKG;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public ChuyenDe getChuyende() {
        return chuyende;
    }

    public void setChuyende(ChuyenDe chuyende) {
        this.chuyende = chuyende;
    }

    public List<HocVien> getHocvien() {
        return hocvien;
    }

    public void setHocvien(List<HocVien> hocvien) {
        this.hocvien = hocvien;
    }

}
