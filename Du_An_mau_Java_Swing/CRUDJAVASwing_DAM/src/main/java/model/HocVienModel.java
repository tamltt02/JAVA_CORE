/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entities.KhoaHoc;
import entities.NguoiHoc;

/**
 *
 * @author ADMIN
 */
public class HocVienModel {

    private int maHV;
    private KhoaHoc khoaHoc;
    private NguoiHoc nguoiHoc;
    private double diem;

    public HocVienModel() {
    }

    public HocVienModel(int maHV, KhoaHoc khoaHoc, NguoiHoc nguoiHoc, double diem) {
        this.maHV = maHV;
        this.khoaHoc = khoaHoc;
        this.nguoiHoc = nguoiHoc;
        this.diem = diem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public KhoaHoc getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public NguoiHoc getNguoiHoc() {
        return nguoiHoc;
    }

    public void setNguoiHoc(NguoiHoc nguoiHoc) {
        this.nguoiHoc = nguoiHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

   
}
