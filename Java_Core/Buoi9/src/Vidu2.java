/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Vidu2 {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            String name = sc.next();
            a.add(name);
        }
        Collections.shuffle(a);
        System.out.println(a);
    }
}
