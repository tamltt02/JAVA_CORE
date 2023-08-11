/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_XuLyNgoaiLe;

/**
 *
 * @author ADMIN
 */
public class S2_CuPhapVaCachSuDung {

    public static void main(String[] args) {
//        viDuTryCatch();
//TryCatchFinally();
LuuY();
    }

    static void viDuTryCatch() {

        try {
            //Code
            int zero = 0, tb = 10 / zero;
            System.out.println(tb);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Thông báo lỗi:" +e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Đi đến cuối cùng của pt");
    }
    
    static  void TryCatchFinally(){
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
        }finally{
            System.out.println("Khối lệnh luôn được thực thi");
        }
        System.out.println("KT PT");
    }
    
//    static  void LuuY(){
//        try {
//            String[] arr = {"1", "a", "101"};
//            int a = Integer.parseInt(arr[1]);
//        } catch (NumberFormatException e) {
//            System.out.println("NumberFormatException");
//            System.exit(0);//Khối finally k đk thức thi
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }finally{
//            System.out.println("Khối lệnh luôn được thực thi");
//        }
//        System.out.println("KT PT");
//    }
    
        static  void LuuY(){
        try {
            String[] arr = {"1", "a", "101"};
            int a = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            return;//Khối finally vẫn thực thi
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        }finally{
            System.out.println("Khối lệnh luôn được thực thi");
        }
        System.out.println("KT PT");
    }
}
