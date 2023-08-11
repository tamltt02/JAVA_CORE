/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_ThrEAD;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class S1_Thread extends Thread{
    public static void main(String[] args) {
        //Thuc hien dad luong
        S1_Thread th1 = new S1_Thread();
        th1.start();//Khoi dong luong
        S1_Thread th2 = new S1_Thread();
        th2.start();
    }
    
    @Override
    public void run() {
      int a= 0;
        while (true) {            
            System.out.println(a++);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              break;
          }
        }
    }
    
}
