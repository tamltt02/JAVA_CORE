/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN_DOC_GHI_FILE;

import java.util.List;

public interface IStudentService {

    /*
    1. Trong interface phương thức không có body code
    2. Trong interface không bao giờ có private và sẽ luôn là public kể cả khi các bạn để phươn thức ở dạng mặc định
     */
    public String add(Student st);

    public String edit(Student st);

    public String delete(int id);

    public List<Student> find(String txt);

    public List<Student> getlstStudents();//Lấy danh sách sinh viên

    public int getIndexByID(int id);

    public int getMaxID();

    public void fake5Data();

    public String ghiFile(String txt);

    public String docFile(String txt);

}
