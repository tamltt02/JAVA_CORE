/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QLGiaoVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<GiaoVien> listGV = new ArrayList<>();
    GiaoVien gv;
    public void nhapDoituong(){
        String nhap;
        while (true) {            
                   gv = new GiaoVien();
                    gv.setId(Integer.parseInt(getinputValue("id : ")));
                    gv.setTen(getinputValue("tên :"));
                    gv.setSogioday(Double.parseDouble(getinputValue("số giờ dạy :")));
                    listGV.add(gv);
                    System.out.println("Bạn muốn nhập tiếp không? (có/Không)");
                    nhap = sc.nextLine();
                    if(nhap.equalsIgnoreCase("Không")){
                        break;
                    }
        }       
    }
    
    public  void xuatDoiTuong(){
        if(listGV.isEmpty()){
            System.out.println("Danh sash rỗng");
            return;
        }
        for (GiaoVien gv : listGV) {
            gv.inraManHinh();
        }
    }
    
    public void xuattheoKhoang(){
          if(listGV.isEmpty()){
            System.out.println("Danh sash rỗng");
            return;
        }
          double a,b,c=0;
          a = Double.parseDouble(getinputValue("số gờ dạy bắt đầu từ:"));
          b = Double.parseDouble(getinputValue("số gờ dạy kết thúc từ:"));
          if(a>b){
              a=b;
              b=c;
              c=a;
          }
          int dem =0;
          for( int i=0 ; i< listGV.size(); i++){
              if(a <= listGV.get(i).getSogioday() && listGV.get(i).getSogioday() <=b){
                  listGV.get(i).inraManHinh();
                  dem ++;
              }    
              }
           if(dem ==0){
                  System.out.println("Không có giáo viên nào nằm trong khoảng bạn nhập");
          }
    }
    
    public  void tim(){
         if(listGV.isEmpty()){
            System.out.println("Danh sash rỗng");
            return;
        }
         int dem =0;
         int ma = Integer.parseInt(getinputValue("Mã giáo viên bạn muốn tìm :"));
         for (GiaoVien gv : listGV) {
            if(ma == gv.getId()){
                gv.inraManHinh();              
            }
        }
         if(dem ==0){
             System.out.println("không có mã giáo viên bạn muốn tìm.");
         }
    }
    
    public void sapxepGV(){
        listGV.sort((o1,o2) -> o1.getTen().compareTo(o2.getTen()));
    }
    
    
        String getinputValue(String text){
            System.out.println("Mời bạn nhập " +text);
            return sc.nextLine();
    }
}
