/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_XuLyNgoaiLe;

/**
 *
 * @author ADMIN
 */
public class S4_Throws {
    public static void main(String[] args) throws Exception{
        S4_Throws s4 = new S4_Throws();
        s4.method();
    }
    
    void method() throws Exception{
        //throw new Exception("Lỗi  rồi");
        int a = 10/0;
    }
}
