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
public abstract class Person implements Serializable{

    private int id;
    private String ten;
    private String tenDem;
    private String ho;
     private String NamSinh;
    private int GioiTinh;

    public Person() {
    }

    public Person(int id, String ten, String tenDem, String ho, String NamSinh, int GioiTinh) {
        this.id = id;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    public abstract void inRa();
}
