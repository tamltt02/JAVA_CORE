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
public class student {

    public String name;
    public double mark;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fullname: ");
        this.name = scanner.nextLine();
        System.out.println("Mark: ");
        this.mark = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Fullname : " + this.name);
        System.out.println("Mark : " + this.mark);
    }
    public String getName(){
        return null;
    }
}
