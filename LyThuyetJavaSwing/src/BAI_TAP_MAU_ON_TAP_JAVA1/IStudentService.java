/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

/**
 *
 * @author ADMIN
 */
public interface IStudentService{

    /*
    1.Trong interface phương thức không k có body
    2.Trong không bh có private và sẽ luôn là public kể cả PT ở dạng mặc  định
     */
    public String add();
    public String edit();
    public String delete();
    public String find();
    public void InRaManHinh();
}
