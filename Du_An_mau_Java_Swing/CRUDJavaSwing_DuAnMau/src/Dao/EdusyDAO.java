/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.ChuyenDe;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface EdusyDAO<T> {

    public List<T> getDataQuery();

    public void them(T x);

    public void sua(T x);

    public void xoa(T x);

}
