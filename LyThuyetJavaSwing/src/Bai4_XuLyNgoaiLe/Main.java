/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_XuLyNgoaiLe;

import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
      //  FileWriter f = new FileWriter("");
        try {
            HocSinhService hss = new HocSinhService();
            hss.checkTuoiYeu(15);
        } catch (TuoiDeYeuException ex) {
            System.out.println(ex.toString());
        }
    }
}
