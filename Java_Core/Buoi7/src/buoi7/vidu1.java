/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class vidu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so ptu mang : ");
        n = sc.nextInt();

        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ", i + 1);
            number[i] = sc.nextInt();
        }
        System.out.println("Mang sau khi nhap : ");
        for (int i = 0; i < n; i++) {
            System.out.println(number[i]);
        }
        int sum = 0;
        double tB = 0;
        for (int i = 0; i < n; i++) {
            sum += number[i];
        }
        tB = (double) sum / number.length;
        System.out.println("TBC : " + tB);
        int i, a = 0;
        System.out.println("Lap phuong cac phan tu : ");
        for (i = 0; i < n; i++) {
            a = number[i]* number[i]* number[i];
            System.out.println(a);
        }
        
    }
}
