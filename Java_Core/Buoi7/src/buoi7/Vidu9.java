/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Vidu9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số phần tử của mảng : ");
        n = sc.nextInt();

        String name[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i + 1);
            sc.nextLine();
            name[i] = sc.nextLine();
        }
        System.out.println("Mảng sau khi nhập là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(name[i] + " ");
        }
        Arrays.sort(name);
        System.out.println("\nMảng sau sx là:");
        for (int i = 0; i < n; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.print("\nNhập tên cần tìm : ");
        String findName = sc.nextLine();
        boolean tim = false;
        for (int i = 0; i < n; i++) {
            if (name[i].equals(findName)) {
                System.out.println("Vị trí tìm tên " + findName + " là vị trí thứ:  " + (i+1) );
                tim = true;
                break;
            }
        }
        name[0] = "Thi";
        System.out.println(Arrays.toString(name));
    }
}
