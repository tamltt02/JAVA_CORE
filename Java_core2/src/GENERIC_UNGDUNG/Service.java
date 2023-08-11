/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GENERIC_UNGDUNG;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class Service<T> implements  IsCRUD<T>{

    public Service() {
    }

    List<T> lstTemp = new ArrayList<>();
    @Override
    public String add(T st) {
       lstTemp.add(st);
       return "Thêm thành công";
    }

    @Override
    public String edit(T st) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<T> find(String txt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<T> getlstStudents() {
       return lstTemp;
    }
    
}
