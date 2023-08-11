/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_XuLyNgoaiLe;

/**
 *
 * @author ADMIN
 */
public class HocSinhService {
    public  void checkTuoiYeu(int tuoi) throws TuoiDeYeuException{
        if(tuoi< 16){
            throw  new TuoiDeYeuException("Ban chua du tuoi yeu");
        }else{
            System.out.println("Ban da du tuoi");
        }
    }
}
