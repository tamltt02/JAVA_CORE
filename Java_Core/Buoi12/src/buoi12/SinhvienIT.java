/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
public class SinhvienIT extends SinhVien {

    public double diemJava;
    public double diemCss;

    @Override
    public double getdiemTB() {
        return (2* diemJava + diemCss)/3;
    }

}
