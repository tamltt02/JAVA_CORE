/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11;


/**
 *
 * @author ADMIN
 */
public class Student extends person{
    private String ma ;
    private double diemTB;
    private String email ;

    public Student(String ma, double diemTB, String email, String ten, String gioitinh, String diachi, String ngaysinh) {
        super(ten, gioitinh, diachi, ngaysinh);
        this.ma = ma;
        this.diemTB = diemTB;
        this.email = email;
    }

    public Student() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
    @Override
    public void xuat() {
               System.out.printf("Mã SV : %s\n Tên: %s\n Giới tính : %s\n Ngày sinh : %s\n Địa chỉ : %s\n Email: %s\n Điểm TB : %.2f\n\n", getMa(),getTen(),getGioitinh(),getNgaysinh(),getDiachi(),getEmail(),getDiemTB());

    }
    
}
