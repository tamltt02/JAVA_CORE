/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11;

/**
 *
 * @author ADMIN
 */
public class person {
    private String ten ;
    private String gioitinh ;
    private String diachi ;
    private String ngaysinh ;

    public person(String ten, String gioitinh, String diachi, String ngaysinh) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
    }

    public person() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public void xuat(){
        System.out.printf("Tên: %s\t Giới tính : %s\t Địa chỉ : %s\t Ngày sinh : %s\t",ten,gioitinh,diachi,ngaysinh);
    }
}
