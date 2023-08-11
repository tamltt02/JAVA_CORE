/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASSIGNMENT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Utilities {
      boolean checkSo(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
      
       boolean checkEmail(String text) {
        Pattern pattern = Pattern.compile("^(.+)@(\\S+)$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
//        String convertFullName(String fullname) {
//        String[] arrName = fullname.split("\\s+");
//        String fullN = "";
//        for (String x : arrName) {
//            fullN += vietHoaChuCaiDau(x) + " ";
//        }
//        return fullN.trim();
//    }
//
//    String vietHoaChuCaiDau(String text) {
//        var temp = text.trim().toLowerCase();
//        return String.valueOf(temp.charAt(0)).toUpperCase() + text.substring(1);//= Dung
//    }
    
        public String[] getAllYears() {
        String[] arrNamSinh = new String[2023 - 1800];
        int temp = 1800;
        for (int i = 0; i < arrNamSinh.length; i++) {
            arrNamSinh[i] = String.valueOf(temp);
            temp++;
        }
        return arrNamSinh;
    }
      
}
