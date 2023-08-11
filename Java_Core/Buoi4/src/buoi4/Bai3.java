/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author ADMIN
 */
public class Bai3 {
        public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=500; i++) {
            if (i % 5 == 0 ) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
