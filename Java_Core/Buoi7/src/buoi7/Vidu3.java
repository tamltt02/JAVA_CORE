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
public class Vidu3 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so ptu mang : ");
        n = sc.nextInt();

        String name[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ", i + 1);
            name[i] = sc.nextLine();
        }
    }
}
