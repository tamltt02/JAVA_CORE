/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    IStudentService _iSinhVienService;
    DefaultTableModel _dDefaultTableModel;
    DefaultComboBoxModel _dComboBoxModel;
    Utilities _Utilities;
    boolean flag = true;

    public Main() {
        initComponents();
        _iSinhVienService = new StudentService();
        _Utilities = new Utilities();
        cbcGioiTinh();
        radioNganh();
        txt_Id.setEnabled(false);//Làm mờ ô text box và không cho can thiệp vào dữ liệu
        txt_msv.setEnabled(false);
        getMAXID();//Tự động nhẩy ID ở trên GUI

    }

    void loadData(List<Student> data) {
        _dDefaultTableModel = (DefaultTableModel) tbl_sinhvien.getModel();
        _dDefaultTableModel.setRowCount(0);
        int stt = 1;
        for (Student x : data) {
            _dDefaultTableModel.addRow(new Object[]{stt++, x.getId(), x.getTen(), x.getSdt(), x.getMsv(), x.getNganhHoc(), x.getGioiTinh() == 1 ? "Nam" : x.getGioiTinh() == 0 ? "Nữ" : "Không xác định"});
        }
        getMAXID();
    }

    void getMAXID() {
        txt_Id.setText(String.valueOf(_iSinhVienService.getMaxID()));
    }

    Student getDataGui() {//Trả về 1 đối tượng lấy từ ControL
        return new Student(txt_msv.getText(),
                (cbc_sex.getSelectedItem() == "Nam" ? 1 : cbc_sex.getSelectedItem() == "Nữ" ? 0 : 2), rdb_Mob.isSelected() ? "MOB" : rdb_udpm.isSelected() ? "UDPM" : "WEB ", Integer.parseInt(txt_Id.getText()), txt_ten.getText(), txt_sdt.getText());
    }

    void cbcGioiTinh() {
        _dComboBoxModel = new DefaultComboBoxModel();
        _dComboBoxModel.addElement("Nam");
        _dComboBoxModel.addElement("Nữ");
        _dComboBoxModel.addElement("Không xác định");
        cbc_sex.setModel(_dComboBoxModel);
    }

    void radioNganh() {
        ButtonGroup btng = new ButtonGroup();
        btng.add(rdb_Mob);
        btng.add(rdb_udpm);
        btng.add(rdb_web);
        rdb_udpm.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_fakeData = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_tim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sinhvien = new javax.swing.JTable();
        txt_timkiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        rdb_Mob = new javax.swing.JRadioButton();
        cbc_sex = new javax.swing.JComboBox<>();
        btn_xoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_msv = new javax.swing.JTextField();
        rdb_udpm = new javax.swing.JRadioButton();
        rdb_web = new javax.swing.JRadioButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_fakeData.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        btn_fakeData.setText("Fake Data");
        btn_fakeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fakeDataActionPerformed(evt);
            }
        });
        getContentPane().add(btn_fakeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 40));

        btn_sua.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 40));

        btn_them.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        getContentPane().add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 40));

        btn_tim.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        btn_tim.setText("Tìm");
        getContentPane().add(btn_tim, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, 40));

        tbl_sinhvien.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        tbl_sinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "ID", "TÊN", "SĐT", "MSV", "NGÀNH HỌC", "GIỚI TÍNH"
            }
        ));
        tbl_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sinhvien);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 760, 170));

        txt_timkiem.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timkiemCaretUpdate(evt);
            }
        });
        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyPressed(evt);
            }
        });
        getContentPane().add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 160, 38));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel8.setText("Msv:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_Id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 139, 30));

        rdb_Mob.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        rdb_Mob.setText("MOB");
        getContentPane().add(rdb_Mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        cbc_sex.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        cbc_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbc_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        btn_xoa.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setText("Quản lý sinh viên FPOLY SP22");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 47, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setText("Tên: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel4.setText("Sdt :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txt_ten.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        txt_ten.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_tenCaretUpdate(evt);
            }
        });
        txt_ten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_tenMouseExited(evt);
            }
        });
        getContentPane().add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 178, -1));

        txt_sdt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 141, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setText("Ngành:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel7.setText("Sex:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 30));

        txt_msv.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txt_msv, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 181, -1));

        rdb_udpm.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        rdb_udpm.setText("UDPM");
        getContentPane().add(rdb_udpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        rdb_web.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        rdb_web.setText("WEB");
        getContentPane().add(rdb_web, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        btn_clear.setText("clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btn_fakeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fakeDataActionPerformed
      _iSinhVienService.fake5Data();
      loadData(_iSinhVienService.getlstStudents());
      btn_fakeData.setEnabled(false);
  }//GEN-LAST:event_btn_fakeDataActionPerformed

  private void txt_tenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tenMouseExited
      // TODO add your handling code here:
      if (txt_ten.getText().isBlank()) {
          //txt_msv.setText("");//
          return;
      }
      String name = _Utilities.convertFullName(txt_ten.getText());
      txt_ten.setText(name);
      // txt_msv.setText(_Utilities.msvFpoly(name, _iSinhVienService.getMaxID(), 0));
  }//GEN-LAST:event_txt_tenMouseExited

  private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
      JOptionPane.showMessageDialog(this, _iSinhVienService.add(getDataGui()));
      loadData(_iSinhVienService.getlstStudents());
  }//GEN-LAST:event_btn_themActionPerformed

  private void txt_timkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyPressed
      loadData(_iSinhVienService.find(txt_timkiem.getText()));
  }//GEN-LAST:event_txt_timkiemKeyPressed

  private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
      int index = tbl_sinhvien.getSelectedRow();//Lấy đc vị trí người dùng bấm
      //Chưa làm hành động bấm vào dưới load lên trên

      JOptionPane.showMessageDialog(this, _iSinhVienService.delete(Integer.parseInt(txt_Id.getText())));
      loadData(_iSinhVienService.getlstStudents());
  }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed

        JOptionPane.showMessageDialog(this, _iSinhVienService.edit(getDataGui()));
        loadData(_iSinhVienService.getlstStudents());
    }//GEN-LAST:event_btn_suaActionPerformed

    private void txt_tenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_tenCaretUpdate
        // TODO add your handling code here:
        if (txt_ten.getText().isBlank() || txt_ten.getText().isEmpty()) {
            txt_msv.setText("");
        } else {
            txt_msv.setText(_Utilities.msvFpoly(txt_ten.getText(), Integer.parseInt(txt_Id.getText()), 0));
        }
    }//GEN-LAST:event_txt_tenCaretUpdate

    private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
        // TODO add your handling code here:
loadData(_iSinhVienService.find(txt_timkiem.getText()));
    }//GEN-LAST:event_txt_timkiemCaretUpdate

    private void tbl_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sinhvienMouseClicked
        // TODO add your handling code here:
        int indexCLick = tbl_sinhvien.getSelectedRow();
        //Sau ng dùng bấm data sẽ biết index
        var sv = _iSinhVienService.getlstStudents().get(indexCLick);
        txt_Id.setText(String.valueOf(sv.getId()));
        txt_ten.setText(sv.getTen());
        txt_sdt.setText(sv.getSdt());
        txt_msv.setText(sv.getMsv());
        rdb_Mob.setSelected(sv.getNganhHoc().equals("MOB") ? true : false);
        rdb_udpm.setSelected(sv.getNganhHoc().equals("UDPM") ? true : false);
        rdb_web.setSelected(sv.getNganhHoc().equals("ƯEB") ? true : false);
        cbc_sex.setSelectedItem(sv.getGioiTinh() == 1 ? "Nam" : sv.getGioiTinh() == 0 ? "Nữ" : "Không xác định");
        //Sau khi ấn table nút add bị ẩn
        btn_them.setEnabled(false);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);

    }//GEN-LAST:event_tbl_sinhvienMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        btn_them.setEnabled(true);
        txt_Id.setText("");
        txt_sdt.setText("");
        txt_ten.setText("");
        txt_msv.setText("");
        rdb_udpm.setSelected(true);
        cbc_sex.setSelectedIndex(0);
        getMAXID();
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);

    }//GEN-LAST:event_btn_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_fakeData;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_tim;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbc_sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_Mob;
    private javax.swing.JRadioButton rdb_udpm;
    private javax.swing.JRadioButton rdb_web;
    private javax.swing.JTable tbl_sinhvien;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_msv;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
