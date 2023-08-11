/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Utinities {

    boolean CheckSo(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    String convertFullName(String fullname) {
        String[] arr = fullname.split("\\s+");
        String fullN = "";
        for (String x : arr) {
            fullN += vietHoaChuCaiDau(x) + " ";
        }
        return fullN;
    }

    String vietHoaChuCaiDau(String text) {
        var temp = text.trim().toLowerCase();
        return String.valueOf(temp.charAt(0)).toUpperCase() + text.substring(1);
    }
//Viết PT tạo mã sinh viên tự động khi nhập tên NGUYỄN VĂN CHƯƠNG=> ChuongnvPH1    

    String MaSV(String fullname,int stt,int a) {
        String[] arr = fullname.split("\\s+");
        String maSV =vietHoaChuCaiDau(arr[arr.length -1]) ;
        for (int i = 0; i < arr.length-1; i++) {
            maSV += String.valueOf(arr[i].charAt(0)).toLowerCase();
        }
            maSV += ((a ==0) ? "PH" :"")+String.valueOf(stt);
        return maSV;
    }

}
