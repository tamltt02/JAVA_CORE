/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_GENERIC;

/**
 *
 * @author ADMIN
 */
//Giới hạn kiểu dữ lệu không cho phép thoải mái mà chỉ đk là kiểu số
public class S2_Limited<T extends Number> {
    private T number ;

    public S2_Limited() {
    }

    public S2_Limited(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
    public double getThapPhan(){
        return number.doubleValue() - number.intValue();
        
    }
    //Dấu hỏi đại diện cho tất cả kiểu dữ liệu thuộc Number
    public  boolean checkEqual(S2_Limited<?> limited){
       if(number.doubleValue() == limited.getNumber().doubleValue()) {
           return true;
       }
       return false;
    }
}
