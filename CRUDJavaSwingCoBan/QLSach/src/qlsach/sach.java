/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsach;

/**
 *
 * @author ADMIN
 */
public class sach {

    private String masach;
    private String tensach;
    private String maTL;
    private String nxb;
    private int soluong;
    private float Giaban;

    public sach() {
    }

    public sach(String masach, String tensach, String maTL, String nxb, int soluong, float Giaban) {
        this.masach = masach;
        this.tensach = tensach;
        this.maTL = maTL;
        this.nxb = nxb;
        this.soluong = soluong;
        this.Giaban = Giaban;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGiaban() {
        return Giaban;
    }

    public void setGiaban(float Giaban) {
        this.Giaban = Giaban;
    }

}
