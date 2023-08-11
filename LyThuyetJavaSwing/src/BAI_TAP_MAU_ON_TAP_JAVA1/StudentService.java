/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StudentService implements IStudentService {//code khác chức năng CRUD

    Scanner _sc;
    String _input;
    List<Student> _listStudent;
    Student _student;
    Utinities _utUtinities;

    public StudentService() {
        _sc = new Scanner(System.in);
        _listStudent = new ArrayList<Student>();
        _utUtinities = new Utinities();
        fake5Data();

    }

    public void fake5Data() {
        _listStudent.add(new Student("AnvPH1", "UDPM.JAVA", 1, "Nguyễn Văn A", "0123456"));
        _listStudent.add(new Student("BnvPH2", "UDPM.NET", 2, "Nguyễn Văn B", "0123456"));
        _listStudent.add(new Student("CnvPH3", "UDPM.JAVA", 3, "Nguyễn Văn C", "0123456"));
        _listStudent.add(new Student("DnaPH4", "UDPM.JAVA", 4, "Nguyễn Anh D", "0123456"));
        _listStudent.add(new Student("EnvPH5", "UDPM.NET", 5, "Nguyễn Văn E", "0123456"));
    }

    @Override
    public String add() {
        System.out.println("Mời bạn nhập sl:");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _student = new Student();
            _student.setId(getmaxID(_listStudent) + 1);
            System.out.println("Mời bạn nhập tên:");
            _student.setTen(_utUtinities.convertFullName(_sc.nextLine()));
            System.out.println("Mời bạn nhập sđt:");
            _student.setSdt(_sc.nextLine());
            _student.setMsv(_utUtinities.MaSV(_student.getTen(), _student.getId(), 0));
            System.out.println("Chọn ngành:");
            System.out.println("1.C#");
            System.out.println("2.Java");
            System.out.println("Mời bạn chọn ngành SV");
            String nganh = _sc.nextLine();
            _student.setNganhHoc(nganh.equals("1") ? "C#" : "Java");
            _listStudent.add(_student);
        }
        return "Thêm thành công";
    }

    @Override
    public String edit() {
        int index = getIndexByID(Integer.parseInt(_sc.nextLine()));
        if (index == -1) {
            return "kt";
        }
        System.out.println("Mời bạn nhập tên:");
        _student.setTen(_utUtinities.convertFullName(_sc.nextLine()));
        System.out.println("Mời bạn nhập sđt:");
        _student.setSdt(_sc.nextLine());
        _student.setMsv(_utUtinities.MaSV(_student.getTen(), _student.getId(), 0));
        System.out.println("Chọn ngành:");
        System.out.println("1.C#");
        System.out.println("2.Java");
        System.out.println("Mời bạn chọn ngành SV");
        String nganh = _sc.nextLine();
        _student.setNganhHoc(nganh.equals("1") ? "C#" : "Java");
        return "Đã sửa tc";
    }

    @Override
    public String delete() {
        System.out.println("Mời bạn nhập iD:");
        int index = getIndexByID(Integer.parseInt(_sc.nextLine()));
        if (index == -1) {
            return "kt";
        }
        _listStudent.remove(index);
        return "Tìm thấy";
    }

    @Override
    public String find() {
        System.out.println("Mời bạn nhập iD:");
        int index = getIndexByID(Integer.parseInt(_sc.nextLine()));
        if (index == -1) {
            return "kt";
        }
        _listStudent.get(index).inRaManHinh();
        return "Tìm thấy";
    }

    @Override
    public void InRaManHinh() {
        for (Student x : _listStudent) {
            x.inRaManHinh();
        }
    }

    public int getmaxID(List<Student> listSt) {
        int max = listSt.get(0).getId();
        for (Student x : listSt) {
            if (max < x.getId()) {
                max = x.getId();
            }
        }
        return max;
    }

    public int getIndexByID(int id) {
        for (int i = 0; i < _listStudent.size(); i++) {
            if (_listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
