/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "HocVien")
public class HocVien implements Serializable {

    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int MaHV;
    
    @Column
    private double Diem;
    
    @ManyToOne
    @JoinColumn(name = "MaKH")
    private KhoaHoc khoahoc ;
    
    @ManyToOne
    @JoinColumn(name = "MaNH")
    private NguoiHoc nguoihoc ;
    public HocVien() {
    }

    public HocVien(int MaHV, double Diem, KhoaHoc khoahoc, NguoiHoc nguoihoc) {
        this.MaHV = MaHV;
        this.Diem = Diem;
        this.khoahoc = khoahoc;
        this.nguoihoc = nguoihoc;
    }

    public int getMaHV() {
        return MaHV;
    }

    public void setMaHV(int MaHV) {
        this.MaHV = MaHV;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

    public KhoaHoc getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(KhoaHoc khoahoc) {
        this.khoahoc = khoahoc;
    }

    public NguoiHoc getNguoihoc() {
        return nguoihoc;
    }

    public void setNguoihoc(NguoiHoc nguoihoc) {
        this.nguoihoc = nguoihoc;
    }


}
