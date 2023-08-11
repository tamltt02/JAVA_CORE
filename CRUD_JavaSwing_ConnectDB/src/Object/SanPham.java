/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author ADMIN
 */
public class SanPham {

    private int id;
    private String ma;
    private String ten;
    private int namBaoHanh;
    private float TrongLuong;
    private String mota;
    private int SLSPton;
    private float GiaNhap;
    private float GiaBan;
    private int idDSP ;

    public SanPham() {
    }

    public SanPham(int id, String ma, String ten, int namBaoHanh, float TrongLuong, String mota, int SLSPton, float GiaNhap, float GiaBan, int idDSP) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.namBaoHanh = namBaoHanh;
        this.TrongLuong = TrongLuong;
        this.mota = mota;
        this.SLSPton = SLSPton;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.idDSP = idDSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public float getTrongLuong() {
        return TrongLuong;
    }

    public void setTrongLuong(float TrongLuong) {
        this.TrongLuong = TrongLuong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSLSPton() {
        return SLSPton;
    }

    public void setSLSPton(int SLSPton) {
        this.SLSPton = SLSPton;
    }

    public float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(float GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(int idDSP) {
        this.idDSP = idDSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", namBaoHanh=" + namBaoHanh + ", TrongLuong=" + TrongLuong + ", mota=" + mota + ", SLSPton=" + SLSPton + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", idDSP=" + idDSP + '}';
    }
    
}
