/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_ThrEAD;

/**
 *
 * @author ADMIN
 */
public class S3_Thread_Implement implements Runnable{
    
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
    public static void main(String[] args) {
        Thread th3 = new Thread( new S3_Thread_Implement());//khoi tao nhanh doi tuong
        th3.start();
        Thread th4 = new Thread( new S3_Thread_Implement());
        th4.start();
    }
    
}
