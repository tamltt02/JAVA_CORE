/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_XuLyNgoaiLe;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ADMIN
 */
public class S1_Exception {

    public static void main(String[] args) {
//        Exception2();
//        UncheckedExcep();
//        ViduTH();
        CoTheSDNhieuCatch();
    }

    static void Exception1() {
        int zero = 0;
        int average = 10 / zero;
    }

    static void Exception2() {
        try {
            String input = "Tâm";
            int number = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
        }
    }

    static void UncheckedExcep() {
        String temp = null;
        System.out.println(temp.length());
    }

    static void CheckedExcep() {
        try {
            FileReader f = new FileReader("file không tồn tại");
        } catch (FileNotFoundException fileNotFoundException) {
        }
    }

    static void ViduTH() {
        int a = 10 / 0;//ArithmeticException
        String temp = null;
        System.out.println(temp.length());
        int b = Integer.parseInt("a");
        int arr[] = new int[5];//ArrayIndexOutOfBoundsException
        arr[9] = 1;
    }

    static void CoTheSDNhieuCatch() {
        try {
            String[] arr = {"1", "a", "101"};
            int a = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");

        }
    }
}
