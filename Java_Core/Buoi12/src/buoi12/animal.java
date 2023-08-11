/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12;

/**
 *
 * @author ADMIN
 */
abstract public class animal {
    private String name;
    private String loai;

    public animal(String name, String loai) {
        this.name = name;
        this.loai = loai;
    }
    
    public animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaiString() {
        return loai;
    }

    public void setLoaiString(String loai) {
        this.loai = loai;
    }

    abstract public void xuat();
        
}
