/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ADMIN
 */
public class S2_AWt1 extends Frame implements ActionListener {

    Button btnRed, btnYellow; //khởi tạo 2 nút
    Label lbltext = new Label(); //Khởi tạo 1 nhãn

    public S2_AWt1(String title) throws HeadlessException {//cst lớp cha
        setTitle(title);
        setLayout(new FlowLayout()); // set bố cục của form
        btnRed = new Button("Nút đỏ"); // khởi tạo tên nút
        add(btnRed);//add nút vào GUI
        btnRed.addActionListener(this); //sự kiện cho nút vừa add
        
        btnYellow = new Button("Nút vàng");
        add(btnYellow);
        btnYellow.addActionListener(this);
        

    }

    public static void main(String[] args) {
        S2_AWt1 frm = new S2_AWt1("FPOLY FORM");
        frm.setSize(500, 300);
        frm.show();
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String str = e.getActionCommand();
       if(str.equals("Nút đỏ")){
           this.setBackground(Color.red);
       }
       if(str.equals("Nút vàng")){
           this.setBackground(Color.yellow);
       }  
       
    }

}
