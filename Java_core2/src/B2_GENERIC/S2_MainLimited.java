/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_GENERIC;

/**
 *
 * @author ADMIN
 */
public class S2_MainLimited {

    public static void main(String[] args) {
        // looix:  S2_Limited<String> s2 = new S2_Limited<>();
        S2_Limited<Double> s2 = new S2_Limited<>();
        // number bene class laf kieeru double
        s2.setNumber(8.7);
        System.out.println(s2.getThapPhan());
        System.out.println(s2.getNumber());

        S2_Limited<Float> s2float = new S2_Limited<>(8.7f);
        System.out.println(s2float.getThapPhan());
   //sử dụng so s
    
        S2_Limited<Integer> s2Integer = new S2_Limited<>(10);
        S2_Limited<Float> s2loat2= new S2_Limited<>(10.0f);
        System.out.println("s2Integer == s2float2 ?" +s2Integer.checkEqual(s2loat2));
    }
}
