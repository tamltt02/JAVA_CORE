/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
public class demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NhanVien nv1 = new NhanVien("Tâm",1000);
       nv1.xuat();
       NhanVien nv2 = new LaoCong(10,"Thanh",1000);
       nv2.xuat();
       NhanVien nv3 = new TruongPhong(10000,"lê",1000);
       nv3.xuat();
       
    }
    
}
