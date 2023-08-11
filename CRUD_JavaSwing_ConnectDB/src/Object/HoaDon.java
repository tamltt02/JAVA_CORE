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
public class HoaDon {
    private int id ;
    private String ma ;
    private Date ngayTao ;
    private int tinhtrang ;
    private int idNV ;

    public HoaDon() {
    }

    public HoaDon(int id, String ma, Date ngayTao, int tinhtrang, int idNV) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.tinhtrang = tinhtrang;
        this.idNV = idNV;
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }


    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", ma=" + ma + ", ngayTao=" + ngayTao + ", tinhtrang=" + tinhtrang +  ", idNV=" + idNV + '}';
    }
    
}
