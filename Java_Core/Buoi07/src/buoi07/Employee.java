/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi07;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Employee {
    public String fullName ;
    public double salary ;
    
    //cónstructor
    
//    public Employee(String fullName, double salary){
//        this.fullName = fullName;
//        this.salary = salary;
//    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fullname: ");
        this.fullName = scanner.nextLine();
        System.out.println("Salary: ");
        this.salary = scanner.nextDouble();
    }
    public void output(){
        System.out.println(this.fullName);
        System.out.println(this.salary);
    }
    
    public void setInfo(String fullName, double salary){
        this.fullName = fullName;
        this.salary = salary;
        output();
    }
    //Nap chồng phương thức: cùng tên nhưng khác kiểu tham số
        public void setInfo(String fullName, double salary,String abc){
        this.fullName = fullName;
        this.salary = salary;
        output();
    }
    public double incomTax( ){
        if(this.salary < 5000000){
            return 0;
        }
        double tax = (this.salary - 5000000) * 10/100;
        return tax;
    }
    
}
