/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.util.List;

/**
 *
 * @author 
 */
public interface IEdusysRepository<T> {

    public List<T> getDataQuery();

    public String them(T x);

    public String xoa(T x);

}
