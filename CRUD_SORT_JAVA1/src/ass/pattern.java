/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;

public class pattern {

    public boolean ktMA(String sc) {
        String pattern = "[a-zA-Z]{2}\\d{5}";
        return sc.matches(pattern);
    }

    public boolean ktTen(String sc) {
        String pattern = "[a-zA-Z]{1,30}";
        return sc.matches(pattern);
    }

}
