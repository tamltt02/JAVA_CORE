/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

/**
 *
 * @author ADMIN
 */
public class Teacher extends Person{
    private String maGV;
    private int soGioDay ;
    private String trangThai ;

    public Teacher() {
    }

    public Teacher(String maGV, int soGioDay, String trangThai, int id, String ten, String sdt) {
        super(id, ten, sdt);
        this.maGV = maGV;
        this.soGioDay = soGioDay;
        this.trangThai = trangThai;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    @Override
    public void inRaManHinh() {
        System.out.printf("ID: %d | Tên: %s | SĐT: %s | Mã GV: %s | Số giờ dạy : %d | Trạng Thái : %s \n",getId(),getTen(),getSdt(),getMaGV(),getSoGioDay(),getTrangThai());
    }
    
}
