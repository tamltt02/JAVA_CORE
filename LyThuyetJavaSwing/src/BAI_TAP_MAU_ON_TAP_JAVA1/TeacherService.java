/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TeacherService implements ITeacherService {

    Scanner _sc;
    String _input;
    List<Teacher> _list;
    Utinities _uUtinities;
    Teacher _teacher;

    public TeacherService() {
        _sc = new Scanner(System.in);
        _list = new ArrayList<Teacher>();
        _uUtinities = new Utinities();
        Data();
    }

    public void Data() {
        _list.add(new Teacher("Anhlp1", 35, "Hoạt Động", 1, "Lê Phương Anh", "012345678"));
        _list.add(new Teacher("Anhtn2", 40, "Hoạt Động", 2, "Trần Nhữ Anh", "012345678"));
        _list.add(new Teacher("Chucvt3", 55, "Không Hoạt Động", 3, "Vũ Thanh Chúc", "012345678"));
        _list.add(new Teacher("Duyent4", 65, "Hoạt Động", 4, "Trần Duyên", "012345678"));
        _list.add(new Teacher("Linhnt5", 50, "Hoạt Động", 5, "Nguyễn Thùy Linh", "012345678"));

    }

    @Override
    public String add() {
        _input = getValueInput("sl:");
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _teacher = new Teacher();
            _teacher.setId(getMaxID(_list) + 1);
            _teacher.setTen(_uUtinities.convertFullName(getValueInput("tên GV :")));
            _teacher.setSdt(getValueInput("SĐT :"));
            _teacher.setMaGV(_uUtinities.MaSV(_teacher.getTen(), _teacher.getId(), 1));
            _teacher.setSoGioDay(Integer.parseInt(getValueInput("số giờ dạy :")));
            System.out.println("Mời bạn chọn trạng thái :");
            System.out.println("1.Hoạt động");
            System.out.println("0.Không hoạt động");
            String tt = _sc.nextLine();
            _teacher.setTrangThai(tt.equals("1") ? "Hoạt Động" : "Không hoạt động");
            _list.add(_teacher);
        }
        return "Thêm thành công!";
    }

    @Override
    public String edit() {
        int id = getIndexID(Integer.parseInt(getValueInput("id :")));
        if (id == -1) {
            return "Không tìm thấy!";
        }
        _list.get(id).setTen(_uUtinities.convertFullName(getValueInput("tên GV :")));
        _list.get(id).setSdt(getValueInput("SĐT :"));
        _list.get(id).setMaGV(_uUtinities.MaSV(_teacher.getTen(), _teacher.getId(), 1));
        _list.get(id).setSoGioDay(Integer.parseInt(getValueInput("số giờ dạy :")));
        System.out.println("Mời bạn chọn trạng thái :");
        System.out.println("1.Hoạt động");
        System.out.println("0.Không hoạt động");
        String tt = _sc.nextLine();
        _list.get(id).setTrangThai(tt.equals("1") ? "Hoạt Động" : "Không hoạt động");
        _list.get(id).inRaManHinh();
        return "Đã sửa thành công!";
    }

    @Override
    public String delete() {
        int id = getIndexID(Integer.parseInt(getValueInput("id :")));
        if (id == -1) {
            return "Không tìm thấy!";
        }
        _list.remove(id);
        return "Đã xóa thành công!";
    }

    @Override
    public String find() {
        int id = getIndexID(Integer.parseInt(getValueInput("id :")));
        if (id == -1) {
            return "Không tìm thấy!";
        }
        _list.get(id).inRaManHinh();
        return "Đã tìm thành công!";
    }

    @Override
    public void InRaManHinh() {
        System.out.println("Danh sách GV :");
        for (Teacher tc : _list) {
            tc.inRaManHinh();
        }
    }

    @Override
    public String sortIn() {
        _list.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
        for (Teacher teacher : _list) {
            teacher.inRaManHinh();
        }
        return "Sắp xếp tăng dần thành công";
    }

    @Override
    public String sortDe() {
        _list.sort((o1, o2) -> o2.getTen().compareTo(o1.getTen()));
        for (Teacher teacher1 : _list) {
            teacher1.inRaManHinh();
        }
        return "Sắp xếp giảm dần thành công";

    }

    @Override
    public String findName() {
        _input = getValueInput("dl cần tìm :");
        int count =0;
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).getTen().toLowerCase().contains(_input.toLowerCase()) || _list.get(i).getMaGV().toLowerCase().contains(_input.toLowerCase())) {
                _list.get(i).inRaManHinh();
                count++;
            }
        }
        if(count ==0){
            return "Không tìm thấy!";
        }else{
        return "Đã tìm thành công!";
        }
    }

    public int getIndexID(int id) {
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int getMaxID(List<Teacher> list) {
        int max = list.get(0).getId();
        for (Teacher teacher : list) {
            if (max < teacher.getId()) {
                max = teacher.getId();
            }
        }
        return max;
    }

    public String getValueInput(String text) {
        System.out.println("Mời bạn nhập " + text);
        return _sc.nextLine();
    }
}
