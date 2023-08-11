/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author ADMIN
 */
public class GVFply extends GiaoVien{
    private String nganhday ;

    public GVFply(String nganhday, int id, String ten, double sogioday) {
        super(id, ten, sogioday);
        this.nganhday = nganhday;
    }

    public GVFply() {
    }

    public String getNganhday() {
        return nganhday;
    }

    public void setNganhday(String nganhday) {
        this.nganhday = nganhday;
    }

    @Override
    public void inraManHinh() {
               System.out.printf("ID: %d\t Tên : %s\t  Số giờ dạy%.2f\t Ngành dạy : %s",getId(),getTen(),getSogioday(),getNganhday());

    }
    
}
