/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_XuLyNgoaiLe;

/**
 *
 * @author ADMIN
 */
public class S3_ThrowVaThows {
    public static void main(String[] args) {
       // kiemTraTuoi(15);
       method1();
    }
    static void kiemTraTuoi(int tuoi){
        if(tuoi < 16){
            throw new ArithmeticException("bạn chưa đủ tuổi");}else{
            System.out.println("bạn cbi tinh thần");         
                    }
        }
    static void method1() throws ArithmeticException{
        throw new ArithmeticException("lỗi r bạn ơi");      
    }
}
