/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASSIGNMENT;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class PerSonContact extends Person implements Serializable{

   
    private String sdt1;
    private String sdt2;
    private String email;
    private String GhiChu;

    public PerSonContact() {
    }

    public PerSonContact(String sdt1, String sdt2, String email, String GhiChu, int id, String ten, String tenDem, String ho, String NamSinh, int GioiTinh) {
        super(id, ten, tenDem, ho, NamSinh, GioiTinh);
        this.sdt1 = sdt1;
        this.sdt2 = sdt2;
        this.email = email;
        this.GhiChu = GhiChu;
    }

    public String getSdt1() {
        return sdt1;
    }

    public void setSdt1(String sdt1) {
        this.sdt1 = sdt1;
    }

    public String getSdt2() {
        return sdt2;
    }

    public void setSdt2(String sdt2) {
        this.sdt2 = sdt2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public void inRa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    
}
