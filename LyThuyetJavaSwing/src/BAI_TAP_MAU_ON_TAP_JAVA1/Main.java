/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        IStudentService iss = new StudentService();// lưu đến service
        ITeacherService iTeacher = new TeacherService();
        do {
            System.out.println("Quản lý SV và GV");
            System.out.println("1.Quản lý Sinh Viên");
            System.out.println("2.Quản lý GV");
            System.out.println("3.Thoát");
            System.out.println("Mời bạn chọn :");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    do {
                        System.out.println("===============");
                        System.out.println("Quản lý SV");
                        System.out.println("1.Thêm");
                        System.out.println("2.Sửa");
                        System.out.println("3.Xóa");
                        System.out.println("4.Tìm kiếm");
                        System.out.println("5.Xuất danh sách");
                        System.out.println("6.Thoát");
                        System.out.println("Mời bạn chọn :");
                        choice = sc.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println(iss.add());
                                break;
                            case "2":
                                System.out.println(iss.edit());
                                break;
                            case "3":
                                System.out.println(iss.delete());
                                break;
                            case "4":
                                System.out.println(iss.find());
                                break;
                            case "5":
                                iss.InRaManHinh();
                                break;
                            case "6 ":
                                break;
                            default:
                                System.out.println("Chức  năng bạn không tồn tại");
                        }
                    } while (!choice.equals("6"));
                    break;
                case "2":
                    do {
                        System.out.println("--------------------");
                        System.out.println("Quản lý GV");
                        System.out.println("1.Thêm");
                        System.out.println("2.Sửa");
                        System.out.println("3.Xóa");
                        System.out.println("4.Tìm kiếm");
                        System.out.println("5.Xuất danh sách");
                        System.out.println("6.Tìm kiếm theo tên gần đúng");
                        System.out.println("7.Sắp xếp");
                        System.out.println("8.Thoát");
                        System.out.println("Mời bạn chọn :");
                        choice = sc.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println(iTeacher.add());
                                break;
                            case "2":
                                System.out.println(iTeacher.edit());
                                break;
                            case "3":
                                System.out.println(iTeacher.delete());
                                break;
                            case "4":
                                System.out.println(iTeacher.find());
                                break;
                            case "5":
                                iTeacher.InRaManHinh();
                                break;
                            case "6":
                                System.out.println(iTeacher.findName());
                                break;
                            case "7":
                                String chon;
                                do {
                                    System.out.println("1.Tăng dần");
                                    System.out.println("2.Giảm dần");
                                    System.out.println("0.Thoát");
                                    chon = sc.nextLine();
                                    switch (chon) {
                                        case "1":
                                            System.out.println(iTeacher.sortIn());
                                            break;

                                        case "2":
                                            System.out.println(iTeacher.sortDe());
                                            break;
                                        case "0":
                                            break;
                                        default:
                                            System.out.println("Chức năng bạn không tồn tại");
                                    }
                                } while (!chon.equals("3"));

                                break;
                            case "8":
                                break;
                            default:
                                System.out.println("Chức năng bạn không tồn tại");
                        }
                    } while (!choice.equals("8"));
                    break;
            }
        } while (!choice.equals("3"));
    }
}
