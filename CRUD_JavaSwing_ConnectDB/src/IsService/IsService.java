/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IsService;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IsService<T> {

    public String store(T x, String a);

    public void getdataQuery();

    public List<T> getlist();

    public List<T> sort(int temp);

    public List<T> find(String a);

}
