/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import Object.DongSP;
import Object.HDCT;
import Object.HoaDon;
import Object.NhanVien;
import Object.SanPham;
import Service.DongSPService;
import Service.HDCTService;
import Service.HoaDonService;
import Service.NhanVienService;
import Service.SanPhamService;
import Utilities.Utiliti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormHoaDon extends javax.swing.JPanel {

    /**
     * Creates new form FormHoaDon
     */
    HoaDonService _hdService = new HoaDonService();
    HDCTService _HDCTService = new HDCTService();
    SanPhamService _spService = new SanPhamService();
    NhanVienService _nvService;
    DongSPService _doDongSPService = new DongSPService();
    HoaDon _hd;
    DefaultTableModel _dDefaultTableModel;
    Utilities.Utiliti _utUtiliti;
    NhanVien _nvNhanVien;
    SanPham _spPham;
    JPopupMenu menu = new JPopupMenu("Popup");
    JPopupMenu menu1 = new JPopupMenu("Popup1");
    JPopupMenu menu2 = new JPopupMenu("Popup2");
    java.util.Date date = new java.util.Date();
    int idHoaDon;
    HDCT _hdct;

    public FormHoaDon() {
        initComponents();
        _utUtiliti = new Utiliti();
        _nvService = new NhanVienService();
        loadhoaDon(_hdService.getlist());
        loaddataSanPham(_spService.getlist());
        btn();
    }

    void loadhoaDon(List<HoaDon> list) {
        _dDefaultTableModel = (DefaultTableModel) tbl_hd.getModel();
        _dDefaultTableModel.setRowCount(0);
        int stt = 1;
        for (HoaDon x : list) {
            _dDefaultTableModel.addRow(new Object[]{stt, x.getMa(), x.getNgayTao(), x.getIdNV(), x.getTinhtrang() == 1 ? "Chờ thanh toán" : x.getTinhtrang() == 2 ? "Hủy" : "Đã thanh toán"});
            stt++;
        }
    }

    HoaDon getGUIhd() {
        return new HoaDon(1, "HD" + getMaxID(), date, 1, 91);

    }

    void loaddataSanPham(List<SanPham> lits) {
        DefaultTableModel _dModel = (DefaultTableModel) tbl_sp.getModel();
        _dModel.setRowCount(0);
        int stt = 1;
        for (SanPham x : lits) {
            _dModel.addRow(new Object[]{stt,
                x.getMa(),
                x.getTen(),
                x.getNamBaoHanh(),
                x.getTrongLuong(),
                x.getMota(),
                x.getSLSPton(),
                x.getGiaNhap(),
                x.getGiaBan(),});
            stt++;
        }
    }

    void loadsplenHDCT1(List<HDCT> list) {
        DefaultTableModel _d3 = new DefaultTableModel();
        _d3 = (DefaultTableModel) tbl_hdct.getModel();
        _d3.setRowCount(0);
        for (HDCT x : list) {
            _d3.addRow(new Object[]{x.getStt(), getMasp(x.getIdSanPham()), getTensp(x.getIdSanPham()), x.getSoLuong(), getdongiasp(x.getIdSanPham()), (getdongiasp(x.getIdSanPham()) * x.getSoLuong())});
        }
        sum();
    }

    String getMasp(int id) {
        for (SanPham x : _spService.getlist()) {
            if (x.getId() == id) {
                return x.getMa();
            }
        }
        return null;
    }

    int getidsp(String txt) {
        for (SanPham x : _spService.getlist()) {
            if (x.getMa().equals(txt)) {
                return x.getId();
            }
        }
        return 0;
    }

    Float getdongiasp(int a) {
        for (SanPham x : _spService.getlist()) {
            if (x.getId() == a) {
                return x.getGiaBan();
            }
        }
        return 0f;
    }

    int getsoluong(int a) {
        for (SanPham x : _spService.getlist()) {
            if (x.getId() == a) {
                return x.getSLSPton();
            }
        }
        return 0;
    }

    String getTensp(int id) {
        for (SanPham x : _spService.getlist()) {
            if (x.getId() == id) {
                return x.getTen();
            }
        }
        return null;
    }

    int getidhd(String ma) {
        for (HoaDon x : _hdService.getlist()) {
            if (x.getMa().equals(ma)) {
                return x.getId();
            }
        }
        return 0;
    }

    int getidDongSP(String txt) {
        for (SanPham x : _spService.getlist()) {
            if (x.getMa().equals(txt)) {
                return x.getIdDSP();
            }
        }
        return -1;
    }

    void sum() {
        float sum = 0;
        for (HDCT x : _HDCTService.getList(idHoaDon)) {
            sum += x.getSoLuong() * getdongiasp(x.getIdSanPham());
        }
        txt_sum.setText(String.valueOf(sum));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_tao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hd = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_thanhtoan = new javax.swing.JButton();
        txt_ma = new javax.swing.JTextField();
        txt_tennv = new javax.swing.JTextField();
        txt_sum = new javax.swing.JTextField();
        txt_ngay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tienkhach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tienthua = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_hdct = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sp = new javax.swing.JTable();
        txt_timkiem = new javax.swing.JTextField();
        rdb_huy = new javax.swing.JRadioButton();
        rdb_dtt = new javax.swing.JRadioButton();
        rdb_all = new javax.swing.JRadioButton();
        rdb_ctt = new javax.swing.JRadioButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tao.setText("Tạo Hóa Đơn");
        btn_tao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoActionPerformed(evt);
            }
        });
        add(btn_tao, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 85, 125, 38));

        tbl_hd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Ngày Tạo", "Tên NV", "Tình Trạng"
            }
        ));
        tbl_hd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hdMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_hdMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hd);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 400, 110));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MãHD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 43, -1, -1));

        jLabel2.setText("Ngày Tạo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 86, -1, -1));

        jLabel3.setText("Tên NV");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 126, -1, -1));

        jLabel4.setText("Tiền khách đưa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 209, -1, -1));

        btn_thanhtoan.setText("THANH TOÁN");
        btn_thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhtoanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_thanhtoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 311, 123, 37));
        jPanel1.add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 40, 170, -1));
        jPanel1.add(txt_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 123, 170, -1));
        jPanel1.add(txt_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 166, 170, -1));
        jPanel1.add(txt_ngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 83, 170, -1));

        jLabel5.setText("Tổng tiền");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 169, -1, -1));

        txt_tienkhach.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_tienkhachCaretUpdate(evt);
            }
        });
        jPanel1.add(txt_tienkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 206, 170, -1));

        jLabel6.setText("Tiền thừa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 258, -1, -1));
        jPanel1.add(txt_tienthua, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 255, 170, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 330, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Giỏ hàng"));

        tbl_hdct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn Giá", "Thành Tiền"
            }
        ));
        tbl_hdct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hdctMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_hdctMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_hdct);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 584, 200));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm"));

        tbl_sp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Năm Bảo Hành", "Trọng Lượng", "Mô tả", "SL SP Tồn", "Giá Nhập", "Giá Bán"
            }
        ));
        tbl_sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_spMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_spMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_sp);

        txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timkiemCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 584, 210));

        rdb_huy.setText("Đã Hủy");
        rdb_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_huyActionPerformed(evt);
            }
        });
        add(rdb_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        rdb_dtt.setText("Đã thanh toán");
        rdb_dtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_dttActionPerformed(evt);
            }
        });
        add(rdb_dtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        rdb_all.setText("Tất cả");
        rdb_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_allActionPerformed(evt);
            }
        });
        add(rdb_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        rdb_ctt.setText("Chờ thanh toán");
        rdb_ctt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_cttActionPerformed(evt);
            }
        });
        add(rdb_ctt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_taoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoActionPerformed
        // TODO add your handling code here:
        _hdService.store(getGUIhd(), "INSERT");
        loadhoaDon(_hdService.getlist());

    }//GEN-LAST:event_btn_taoActionPerformed

    private void tbl_spMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_spMouseClicked
        // TODO add your handling code here:
        int index = tbl_hd.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Ban cần chọn hóa đơn");
        }
        Test();
    }//GEN-LAST:event_tbl_spMouseClicked

    private void tbl_spMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_spMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tbl_spMouseReleased

    private void tbl_hdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hdMouseClicked
        // TODO add your handling code here:
        int index = tbl_hd.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Ban cần chọn hóa đơn");
        }
        txt_ma.setText(tbl_hd.getModel().getValueAt(index, 1).toString());
        txt_tennv.setText(tbl_hd.getModel().getValueAt(index, 3).toString());
        txt_ngay.setText(tbl_hd.getModel().getValueAt(index, 2).toString());
        txt_ma.setEnabled(false);
        txt_ngay.setEnabled(false);
        txt_tennv.setEnabled(false);
//        txt_tienkhach.setText("");
//        txt_tienthua.setText("");
        idHoaDon = getidhd(txt_ma.getText());
        loadsplenHDCT1(_HDCTService.getList(idHoaDon));
        huy();
    }//GEN-LAST:event_tbl_hdMouseClicked

    private void tbl_hdctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hdctMouseClicked
        // TODO add your handling code here:
        themsoLuong();
    }//GEN-LAST:event_tbl_hdctMouseClicked

    private void tbl_hdctMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hdctMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tbl_hdctMouseReleased

    private void tbl_hdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hdMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            menu2.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tbl_hdMouseReleased

    private void btn_thanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhtoanActionPerformed
        // TODO add your handling code here:
        if (Float.parseFloat(txt_tienkhach.getText()) < Float.parseFloat(txt_sum.getText())) {
            JOptionPane.showMessageDialog(this, "Thiếu tiền rồi");
            return;
        }
        int index = tbl_hd.getSelectedRow();
        _hd = _hdService.getlist().get(index);
        _hdService.store(new HoaDon(1, _hd.getMa(), date, 3, 91), "UPDATE");
        loadhoaDon(_hdService.getlist());
    }//GEN-LAST:event_btn_thanhtoanActionPerformed

    private void txt_tienkhachCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_tienkhachCaretUpdate
        // TODO add your handling code here:
        if (txt_tienkhach.getText().isBlank()) {
            return;
        }

        txt_tienthua.setText(String.valueOf(Float.parseFloat(txt_tienkhach.getText()) - Float.parseFloat(txt_sum.getText())));
    }//GEN-LAST:event_txt_tienkhachCaretUpdate

    private void rdb_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_huyActionPerformed
        // TODO add your handling code here:
        loadhoaDon(_hdService.find(String.valueOf(2)));
    }//GEN-LAST:event_rdb_huyActionPerformed

    private void rdb_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_allActionPerformed
        // TODO add your handling code here:
        loadhoaDon(_hdService.getlist());
    }//GEN-LAST:event_rdb_allActionPerformed

    private void rdb_cttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_cttActionPerformed
        // TODO add your handling code here:
        loadhoaDon(_hdService.find(String.valueOf(1)));
    }//GEN-LAST:event_rdb_cttActionPerformed

    private void rdb_dttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_dttActionPerformed
        // TODO add your handling code here:
         loadhoaDon(_hdService.find(String.valueOf(3)));
    }//GEN-LAST:event_rdb_dttActionPerformed

    private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
        // TODO add your handling code here:
        loaddataSanPham(_spService.find(txt_timkiem.getText()));
    }//GEN-LAST:event_txt_timkiemCaretUpdate
    void btn() {
        ButtonGroup btn = new ButtonGroup();
        btn.add(rdb_dtt);
        btn.add(rdb_huy);
        btn.add(rdb_all);
        btn.add(rdb_ctt);
        rdb_all.setSelected(true);

    }

    public int getMaxstt() {
        if (_HDCTService.getlist().isEmpty()) {
            return 1;

        }
        int max = _HDCTService.getlist().get(0).getStt();
        for (HDCT x : _HDCTService.getlist()) {
            if (max < x.getStt()) {
                max = x.getStt();
            }
        }
        return max + 1;
    }

    public int getMaxID() {
        if (_hdService.getlist().isEmpty()) {
            return 1;
        }
        int max = _hdService.getlist().get(0).getId();
        for (HoaDon x : _hdService.getlist()) {
            if (max < x.getId()) {
                max = x.getId();
            }
        }
        return max + 1;
    }
    String cbb;

    int gettrangthai(String ma) {
        for (HoaDon x : _hdService.getlist()) {
            if (x.getMa().equals(ma)) {
                return x.getTinhtrang();
            }
        }
        return 0;
    }

    public void Test() {
        menu.removeAll();
        int index = tbl_sp.getSelectedRow();
        _spPham = _spService.getlist().get(index);
        System.out.println(_spPham.getMa());
        JMenuItem item = new JMenuItem("Them");
        if (gettrangthai(txt_ma.getText()) == 3) {
            item.setVisible(false);
            return;
        }
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cbb = JOptionPane.showInputDialog("NHập so luong:");
                if (cbb.isBlank()) {
                    JOptionPane.showMessageDialog(menu, "Dữ liệu k hợp lệ");
                    return;
                }
                if (Integer.parseInt(cbb) > _spPham.getSLSPton()) {
                    JOptionPane.showMessageDialog(menu, "Không đủ số lượng!");
                    return;
                }
                for (HDCT x : _HDCTService.getList(idHoaDon)) {
                    if (x.getIdSanPham() == _spPham.getId()) {
                        JOptionPane.showMessageDialog(menu, "Sản phẩm đã có trong giở hàng");
                        return;
                    }
                }

                _HDCTService.store(new HDCT(getidhd(txt_ma.getText()), _spPham.getId(), Integer.parseInt(cbb), _spPham.getGiaBan(), getMaxstt()), "INSERT");
                loadsplenHDCT1(_HDCTService.getList(idHoaDon));
                _spService.store(new SanPham(getidsp(tbl_sp.getModel().getValueAt(index, 1).toString()),
                        _spPham.getMa(),
                        _spPham.getTen(),
                        _spPham.getNamBaoHanh(),
                        _spPham.getTrongLuong(),
                        _spPham.getMota(),
                        _spPham.getSLSPton() - Integer.parseInt(cbb),
                        _spPham.getGiaNhap(),
                        _spPham.getGiaBan(),
                        _spPham.getIdDSP()), "update");
                loaddataSanPham(_spService.getlist());

            }
        });

        menu.add(item);
    }

    int soluongsp(int a) {
        for (SanPham x : _spService.getlist()) {
            if (x.getId() == a) {
                return x.getSLSPton();
            }
        }
        return 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tao;
    private javax.swing.JButton btn_thanhtoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdb_all;
    private javax.swing.JRadioButton rdb_ctt;
    private javax.swing.JRadioButton rdb_dtt;
    private javax.swing.JRadioButton rdb_huy;
    private javax.swing.JTable tbl_hd;
    private javax.swing.JTable tbl_hdct;
    private javax.swing.JTable tbl_sp;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_ngay;
    private javax.swing.JTextField txt_sum;
    private javax.swing.JTextField txt_tennv;
    private javax.swing.JTextField txt_tienkhach;
    private javax.swing.JTextField txt_tienthua;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables

    public void themsoLuong() {

        menu1.removeAll();
        int index = tbl_hdct.getSelectedRow();
        _spPham = _spService.getlist().get(index);
        System.out.println(index);
        JMenuItem item = new JMenuItem("Them");
        JMenuItem item2 = new JMenuItem("Xoa");
        if (gettrangthai(txt_ma.getText()) == 3) {
            item.setVisible(false);
            item2.setVisible(false);
            return;
        }
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cbb = JOptionPane.showInputDialog("NHập so luong:");
                if (cbb.isBlank()) {
                    JOptionPane.showMessageDialog(menu1, "Dữ liệu không được null");
                    return;
                }
                for (SanPham x : _spService.getlist()) {
                    if (x.getId() == getidsp(tbl_hdct.getModel().getValueAt(index, 3).toString())) {
                        if (x.getSLSPton() < Integer.parseInt(cbb)) {
                            JOptionPane.showMessageDialog(menu1, "Không đủ số lượng!");
                            return;
                        }
                    }
                }
                int sl = Integer.parseInt(tbl_hdct.getModel().getValueAt(index, 3).toString());
                _HDCTService.store(new HDCT(getidhd(txt_ma.getText()),
                        getidsp(tbl_hdct.getModel().getValueAt(index, 1).toString()),
                        Integer.parseInt(cbb),
                        Float.parseFloat(tbl_hdct.getModel().getValueAt(index, 4).toString()),
                        Integer.parseInt(tbl_hdct.getModel().getValueAt(index, 0).toString())), "UPDATE");

                loadsplenHDCT1(_HDCTService.getList(idHoaDon));

                for (SanPham x : _spService.getlist()) {
                    if (x.getId() == getidsp(tbl_hdct.getModel().getValueAt(index, 1).toString())) {
                        _spService.store(new SanPham(-1,
                                x.getMa(),
                                x.getTen(),
                                x.getNamBaoHanh(),
                                x.getTrongLuong(),
                                x.getMota(),
                                x.getSLSPton() + sl - Integer.parseInt(cbb),
                                x.getGiaNhap(),
                                x.getGiaBan(),
                                x.getIdDSP()), "update");
                        loaddataSanPham(_spService.getlist());
                        return;
                    }
                }
            }

        });
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(menu, "Ban chac chan muon xoa khong");
                if (a == 0) {
                    int soluong = Integer.parseInt(tbl_hdct.getModel().getValueAt(index, 3).toString());
                    int id = getidsp(tbl_hdct.getModel().getValueAt(index, 1).toString());
                    String ma = tbl_hdct.getModel().getValueAt(index, 1).toString();
                    _HDCTService.store(new HDCT(getidhd(txt_ma.getText()), getidsp(tbl_hdct.getModel().getValueAt(index, 1).toString()), 1, Float.parseFloat(tbl_hdct.getModel().getValueAt(index, 4).toString()), getMaxstt()), "DELETE");

                    loadsplenHDCT1(_HDCTService.getList(idHoaDon));
                    JOptionPane.showMessageDialog(menu, "Xoa thanh cong");
                    for (SanPham x : _spService.getlist()) {
                        if (x.getId() == id) {
                            _spService.store(new SanPham(-1,
                                    ma,
                                    x.getTen(),
                                    x.getNamBaoHanh(),
                                    x.getTrongLuong(),
                                    x.getMota(),
                                    getsoluong(id) + soluong,
                                    x.getGiaNhap(),
                                    x.getGiaBan(),
                                    x.getIdDSP()), "update");
                            loaddataSanPham(_spService.getlist());
                            return;
                        }
                    }

                }
            }
        });
        menu1.add(item);
        menu1.add(item2);
    }

    public void huy() {

        menu2.removeAll();
        int index = tbl_hd.getSelectedRow();
        _hd = _hdService.getlist().get(index);
        System.out.println(_hd.getMa());
        JMenuItem item3 = new JMenuItem("Hủy");
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = JOptionPane.showConfirmDialog(menu2, "Bạn có muốn hủy không?");
                if (a == 0) {
                    if (_HDCTService.getList(idHoaDon).isEmpty()) {
                        _hdService.store(new HoaDon(1, _hd.getMa(), date, 2, 91), "UPDATE");
                        loadhoaDon(_hdService.getlist());
                        return;
                    } else {
//                        for (HDCT x : _HDCTService.getList(idHoaDon)) {
//                            if (x.getIdHoaDon() == getidhd(txt_ma.getText())) {
//                                int sl = x.getSoLuong();
//                                for (SanPham sp : _spService.getlist()) {
//                                    if (x.getIdSanPham() == sp.getId()) {
//                                        _spService.store(new SanPham(-1,
//                                                sp.getMa(),
//                                                sp.getTen(),
//                                                sp.getNamBaoHanh(),
//                                                sp.getTrongLuong(),
//                                                sp.getMota(),
//                                                sp.getSLSPton() + sl,
//                                                sp.getGiaNhap(),
//                                                sp.getGiaBan(),
//                                                sp.getIdDSP()), "update");
//                                        loaddataSanPham(_spService.getlist());
//                                    }
//                                }
                        _hdService.store(new HoaDon(1, _hd.getMa(), date, 2, 91), "UPDATE");
                        loadhoaDon(_hdService.getlist());
//                            }
//                        }
                    }
                }
            }
        });
        menu2.add(item3);
    }

}
