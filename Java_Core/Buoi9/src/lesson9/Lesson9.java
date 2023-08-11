/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author vuach
 */
public class Lesson9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SVPoly> listSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số sinh viên muốn thêm: ");
                    int number = sc.nextInt();
                    for (int i = 0; i < number; i++) {
                        SVPoly sv = new SVPoly();
                        System.out.print("Nhập họ và tên sinh viên thứ " + (i + 1) + ":\t");
                        sv.setHoTen(sc.next());
                        System.out.print("Nhập điểm TB sinh viên thứ " + (i + 1) + ":\t");
                        sv.setDiemTB(sc.nextInt());
                        listSV.add(sv);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên");
                    for (SVPoly sv : listSV) {
                        System.out.println(sv.toString());
                    }
                    break;
                case 3:
                    System.out.print("Nhập điểm nhỏ nhất: ");
                    int min = sc.nextInt();
                    System.out.print("Nhập điểm lớn nhất: ");
                    int max = sc.nextInt();
                    for (SVPoly sv : listSV) {
                        if (sv.getDiemTB() > min && sv.getDiemTB() < max) {
                            System.out.println(sv);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập tên sinh viên muốn tìm: ");
                    String inputName = sc.next();
                    for (SVPoly sv : listSV) {
                        if (sv.getHoTen().equalsIgnoreCase(inputName)) {
                            System.out.println(sv);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên sinh viên muốn tìm: ");
                    String inputName2 = sc.next();
                    for (SVPoly sv : listSV) {
                        if (sv.getHoTen().equalsIgnoreCase(inputName2)) {
                            System.out.print("Nhập họ và tên mới: ");
                            sv.setHoTen(sc.next());
                            System.out.print("Nhập điểm TB mới: ");
                            sv.setDiemTB(sc.nextInt());
                            System.out.println("Thông tin sinh viên sau khi đã chỉnh sửa");
                            System.out.println(sv);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên sinh viên muốn tìm: ");
                    String inputName3 = sc.next();// Tên nhập vào từ người dùng
                    listSV.removeIf(sv -> sv.getHoTen().equalsIgnoreCase(inputName3));
                    break;
                case 7:
                    Comparator<SVPoly> comp = new Comparator<SVPoly>() {
                        @Override
                        public int compare(SVPoly o1, SVPoly o2) {
                            return o1.getDiemTB().compareTo(o2.getDiemTB());
                        }
                    };
                    Collections.sort(listSV,comp);
                    System.out.println("Danh sách sv sau khi xếp theo điểm : ");
                     for (SVPoly sv : listSV) {
                        System.out.println(sv.toString());
                    }
                case 8 : 
                    Comparator<SVPoly> comp1 = new Comparator<SVPoly>() {
                        @Override
                        public int compare(SVPoly o1, SVPoly o2) {
                            return o1.getHoTen().compareTo(o2.getHoTen());
                        }
                    };
                    Collections.sort(listSV,comp1);
                    System.out.println("Danh sách sv sau khi xếp theo tên : ");
                     for (SVPoly sv : listSV) {
                        System.out.println(sv.toString());
                    }
                default:

            }
        } while (choice < 9);
    }

    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách sinh viên");
        System.out.println("3. Xuất danh sách sinh viên theo khoảng điểm");
        System.out.println("4. Tìm sinh viên theo họ và tên");
        System.out.println("5. Tìm và sửa sinh viên theo họ tên");
        System.out.println("6. Tìm và xóa theo họ tên");
        System.out.println("7. Sắp xếp theo điểm");
        System.out.println("8. Sắp xếp theo họ tên");

        System.out.println("+---------------------------------------------------+");
        System.out.print("Hãy chọn 1 trong số các chức năng sau: ");
        return sc.nextInt();
    }

}
