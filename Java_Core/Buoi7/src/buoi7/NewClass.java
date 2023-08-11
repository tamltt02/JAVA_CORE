/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public final class NewClass {
    public String hoTen;
    public float diem;
    

    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhaajp vao ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap vao diem:");
        this.diem = sc.nextFloat();
    }
    
    public void xuat(){
        System.out.println(this.hoTen);
        System.out.println(this.diem);
    }
        //pthuc khoi tao
    public NewClass(){
       
    }
    public NewClass(String hoTen ,float diem ){
      this.hoTen = hoTen;
      this.diem = diem;
    }
}
