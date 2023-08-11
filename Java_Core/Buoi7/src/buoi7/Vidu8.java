/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Vidu8 {
    public static void main(String[] args) {
        int a[] = {8,2,6,2,9,1,5};
        for(int i=0 ; i< a.length -1 ; i++){
            for(int j=i+1; j< a.length ; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sx: " + Arrays.toString(a));
    }
}
