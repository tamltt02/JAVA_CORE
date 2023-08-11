/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

    boolean checkSo(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    String convertFullName(String fullname) {
        String[] arrName = fullname.split("\\s+");
        String fullN = "";
        for (String x : arrName) {
            fullN += vietHoaChuCaiDau(x) + " ";
        }
        return fullN.trim();
    }

    String vietHoaChuCaiDau(String text) {
        var temp = text.trim().toLowerCase();
        return String.valueOf(temp.charAt(0)).toUpperCase() + text.substring(1);//= Dung
    }

    //Viết 1 phương thức tạo mã sinh viên tự động khi nhập tên NGUYỄN VĂN CHƯƠNG => MSV: ChuongnvPH1
    String msvFpoly(String fullName, int maxMSV, int a) {
        String[] arrName = fullName.split("\\s+");
        String name = vietHoaChuCaiDau(arrName[arrName.length - 1]);
        for (int i = 0; i < arrName.length - 1; i++) {
            name += String.valueOf(arrName[i].charAt(0)).toUpperCase();
        }
        //0 là sinh viên, 1 là GV
        name += ((a == 0) ? "PH" : "") + String.valueOf(maxMSV);
        return unAccent(name);
    }

    public String[] getAllYears() {
        String[] arrNamSinh = new String[2023 - 1800];
        int temp = 1800;
        for (int i = 0; i < arrNamSinh.length; i++) {
            arrNamSinh[i] = String.valueOf(temp);
            temp++;
        }
        return arrNamSinh;
    }

    public String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "");
    }
}
