/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GENERIC_UNGDUNG;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IsCRUD<T> {

    public String add(T st);

    public String edit(T st);

    public String delete(int id);

    public List<T> find(String txt);

    public List<T> getlstStudents();
}
