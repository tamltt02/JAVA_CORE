/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.List;

/**
 *
 * @author
 */
public interface IEduSysService<T> {
    
    public List<T> getlist();

    public String add(T x);
    
    public String update(T x);

    public String delete(T x);

}
