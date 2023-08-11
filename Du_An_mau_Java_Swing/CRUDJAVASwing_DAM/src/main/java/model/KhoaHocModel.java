/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entities.ChuyenDe;
import entities.NhanVien;
import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class KhoaHocModel {
    
   
      private int maKH;
    private ChuyenDe chuyenDe;
    private float hocPhi;
    private int thoiLuong;
    private Date ngayKG;
    private String ghiChu;
    private NhanVien nhanvien;
    private Date ngayTao;

    public KhoaHocModel() {
    }

    public KhoaHocModel(int maKH, ChuyenDe chuyenDe, float hocPhi, int thoiLuong, Date ngayKG, String ghiChu, NhanVien nhanvien, Date ngayTao) {
        this.maKH = maKH;
        this.chuyenDe = chuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.nhanvien = nhanvien;
        this.ngayTao = ngayTao;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public ChuyenDe getChuyenDe() {
        return chuyenDe;
    }

    public void setChuyenDe(ChuyenDe chuyenDe) {
        this.chuyenDe = chuyenDe;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

   
}
