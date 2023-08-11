/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7;

/**
 *
 * @author ADMIN
 */
public class vidu4 {
    public static void main(String[] args) {
        int[] a = {9,3,8,7,3,9,4,2};
        double tong =0;
        for(int x :a){
            if(x % 2 ==0){
                tong +=x;
            }
        }
        System.out.println("Tong : " + tong);
    }
}
