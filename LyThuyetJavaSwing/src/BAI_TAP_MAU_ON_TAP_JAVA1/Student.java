/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

/**
 *
 * @author ADMIN
 */
public class Student extends Person {

    private String msv;
    private String nganhHoc;

    public Student() {
    }

    public Student(String msv, String nganhHoc, int id, String ten, String sdt) {
        super(id, ten, sdt);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    @Override
    public void inRaManHinh() {
        System.out.printf("ID: %d | Tên: %s | SĐT: %s | Mã SV: %s | Ngành học: %s\n",getId(),getTen(),getSdt(),getMsv(),getNganhHoc());
    }

}
