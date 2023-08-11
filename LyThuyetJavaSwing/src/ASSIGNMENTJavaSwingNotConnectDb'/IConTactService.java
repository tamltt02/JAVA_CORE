/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ASSIGNMENT;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IConTactService {

    public String add(PerSonContact ct);

    public String edit(PerSonContact ct);

    public String delete(int ct);

    public List<PerSonContact> findTheoNguoi(String txt);

    public List<PerSonContact> findTheoTen(String txt);

    public List<PerSonContact> findTheosdt(String txt);

    public List<PerSonContact> sortAZ();

    public List<PerSonContact> sortZA();

    public List<PerSonContact> getlstContact();

    public int getIndexByID(int id);

    public int getMaxID();

    public void fakeData();

    public String ghiFile(String path);

    public String docFile(String path);

}
