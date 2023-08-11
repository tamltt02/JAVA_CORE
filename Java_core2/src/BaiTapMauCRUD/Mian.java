/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMauCRUD;


/**
 *
 * @author ADMIN
 */
public class Mian {
    public static void main(String[] args) {
        ChucVuServiceDAO cvs = new ChucVuServiceDAO();
        ChucVu cv1 = new ChucVu(5, "thanh Tam", "Nhân Viên");
        cvs.update(cv1);
        for (ChucVu cv : cvs.selectAll()) {
            System.out.println(cv.toString());
        }
    }
}
