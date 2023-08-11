/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class Buoi9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(9);
        a.add(8);
        a.add(2);
        Collections.swap(a, 0, 2);
        
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);

        Collections.reverse(a);
        System.out.println(a);

    }

}
