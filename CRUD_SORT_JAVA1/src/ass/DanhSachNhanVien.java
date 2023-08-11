/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class DanhSachNhanVien {
   public  final ArrayList<NhanVien> list = new ArrayList<>();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        list.clear();
        do {
            System.out.println("Nhap loai nhan vien (1.Hanh Chinh, 2.Truong Phong, 3.Tiep Thi): ");  
            String loai = sc.nextLine();
            if(loai ==null || loai.equals(""))
                break;
            int nloai = Integer.parseInt(loai);
            switch(nloai){
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(sc);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(sc);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(sc);
                    list.add(nvtt);
                    break;
            }
        } while (true);  
    }
    public void xuat(){
        System.out.println("Danh Sach Nhan Vien: ");
        for (NhanVien nv : list) {
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh)nv).xuat();
            }else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi)nv).xuat();
        }else if (nv instanceof TruongPhong) {
                ((TruongPhong)nv).xuat();
    }         
}
    }
    
    public void xoaNhanVientheoMa(Scanner sc){
        System.out.println("Xoa thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ma = sc.nextLine();
         NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
               tim = nv;
               break;
            }
        }
            if (tim != null) {
                list.remove(tim);
                System.out.println("Da xoa nhan vien");
         
            }else{
                System.out.printf("Khong tim thay nhan vien co ma %s\n ", ma);
            }
    }
      public void xuatTop5NhanVien(){
        sapXepTheoThuNhap();
        int t = (list.size()<5)?list.size():5;
        for (int i = 0; i < t; i++) {
            list.get(i).xuat();
        }
    }
    public void timVaHienThiTheoMa(Scanner sc){
        System.out.println("Nhap ma can tim: ");
        String ma = sc.nextLine();
        NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
               tim = nv;
               break;
            }
        }
            if (tim != null) {
                System.out.println("Thong tin nhan vien tim thay theo ma: ");
                tim.xuat();
            }else{
                System.out.printf("Khong tim thay nhan vien co ma: \n",ma);
            }
    }
    public void capNhatTheoMa(Scanner sc){
        System.out.println("cap nhat thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can cap nhat thong tin: ");
        String ma = sc.nextLine();
        NhanVien tim = null;
        for (NhanVien nv : list) {
            if (ma.equalsIgnoreCase(nv.getMa())) {
                tim = nv;
                break;
            }
        }
        if (tim != null) {
            System.out.println("Nhap thong tin moi cho nhan vien can cap nhat: ");
            if (tim instanceof NhanVienHanhChinh) {
               ((NhanVienHanhChinh)tim).nhap(sc);
            }else  if (tim instanceof TruongPhong) {
                ((TruongPhong)tim).nhap(sc);
        }else if (tim instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi)tim).nhap(sc);
        }
    }else{
            System.out.printf("khong tim thay ma nhan vien: ", ma);
        }
}
    
    public void sapXepTheoTen(){
       Collections.sort(list);
        for (NhanVien nv : list) {
            System.out.println();
        }
    }
    public void sapXepTheoThuNhap(){
       Comparator <NhanVien> comp = new Comparator<NhanVien>(){

           @Override
           public int compare(NhanVien o1, NhanVien o2) {
               int s= 0;
               double tn1 = o1.getThuNhap(), tn2 = o2.getThuNhap();
               if (tn1>tn2) s=-1;
               else if(tn1<tn2) s=1;
               return s;
           }
        };
        Collections.sort(list, comp);
    }
  
    
    public void timNhanVienTheoKhoangLuong(Scanner sc){
        System.out.println("Tim nhan vien theo khoang luong");
        System.out.print("Nhap khoang luong thap nhat: ");
        double min = sc.nextDouble();
        
        System.out.println("Nhap khoang luong cao nhat: ");
        double max = sc.nextDouble();
        boolean tim = false;
        for (NhanVien nhanVien : list) {
            if (min <= nhanVien.getLuong()  &&  nhanVien.getLuong() <= max){
                nhanVien.xuat();
                System.out.println();
                tim = true;
            }
        }
        if (tim = false){
            System.out.println("Khong co nhan vien nao co luong trong khoang can tim");}
    }
    
}

