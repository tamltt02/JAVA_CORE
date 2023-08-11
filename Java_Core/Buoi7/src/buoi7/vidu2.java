/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7;

/**
 *
 * @author ADMIN
 */
public class vidu2 {

    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7, 8};
        //in ra so ptu cua 1 mang
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //canh 2
        for (int item : a) {
            System.out.print(a[item] + " ");
        }
        //in ra mang a duoi dang chuoi

    }

}
