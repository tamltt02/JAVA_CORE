/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class NhanVien {

    private int id;
    private String ma;
    private String TenHo;
    private String TenDem;
    private String Ten;
    private String gioiTinh;
    private Date ngaySinh;
    private int idCV;
    private int idNguoiBaoCao;

    public NhanVien() {
    }

    public NhanVien(int id, String ma, String TenHo, String TenDem, String Ten, String gioiTinh, Date ngaySinh, int idCV, int idNguoiBaoCao) {
        this.id = id;
        this.ma = ma;
        this.TenHo = TenHo;
        this.TenDem = TenDem;
        this.Ten = Ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.idCV = idCV;
        this.idNguoiBaoCao = idNguoiBaoCao;
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

    public String getTenHo() {
        return TenHo;
    }

    public void setTenHo(String TenHo) {
        this.TenHo = TenHo;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getIdCV() {
        return idCV;
    }

    public void setIdCV(int idCV) {
        this.idCV = idCV;
    }

    public int getIdNguoiBaoCao() {
        return idNguoiBaoCao;
    }

    public void setIdNguoiBaoCao(int idNguoiBaoCao) {
        this.idNguoiBaoCao = idNguoiBaoCao;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ma=" + ma + ", TenHo=" + TenHo + ", TenDem=" + TenDem + ", Ten=" + Ten + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", idCV=" + idCV + ", idNguoiBaoCao=" + idNguoiBaoCao + '}';
    }

}
