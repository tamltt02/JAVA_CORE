/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IsEdusyService<T> {
    
     public List<T> getList();

    public void add(T x);

    public void update(T x);

    public void delete(T x);
}

