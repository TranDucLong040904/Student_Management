package qlsv.controller;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import qlsv.model.SinhVien;
import qlsv.service.SinhVienService;
import qlsv.service.SinhVienServiceImpl;

/**
 *
 * @author trand
 */
public class SinhVienController {
    private JButton btnSubmit;
    private JTextField jtfMaSinhVien;
    private JTextField jtfHoTen;
    private JDateChooser jdcNgaySinh;
    private JRadioButton jrdNam;
    private JRadioButton jrdNu;
    private JTextField jtfSoDienThoai;
    private JTextArea  jtaDiaChi;
    private JCheckBox jcbTinhTrang;
    private JLabel jlbMsg;
    
    private SinhVien sinhVien = null;
    
    private SinhVienService sinhVienService = null;

    public SinhVienController(JButton btnSubmit, JTextField jtfMaSinhVien, JTextField jtfHoTen, 
            JDateChooser jdcNgaySinh, JRadioButton jrdNam, JRadioButton jrdNu,
            JTextField jtfSoDienThoai, JTextArea jtaDiaChi, JCheckBox jcbTinhTrang, JLabel jlbMsg) {
        
        this.btnSubmit = btnSubmit; 
        this.jtfMaSinhVien = jtfMaSinhVien;
        this.jtfHoTen = jtfHoTen;
        this.jdcNgaySinh = jdcNgaySinh;
        this.jrdNam = jrdNam;
        this.jrdNu = jrdNu;
        this.jtfSoDienThoai = jtfSoDienThoai;
        this.jtaDiaChi = jtaDiaChi;
        this.jcbTinhTrang = jcbTinhTrang;
        this.jlbMsg = jlbMsg;

        this.sinhVienService = new SinhVienServiceImpl();
        
        

    }
    
    public void setView(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
        
        jtfMaSinhVien.setText("PKA" + sinhVien.getMa_sinh_vien());
        // jtfMaSinhVien.setText("");
        jtfHoTen.setText(sinhVien.getHo_ten());
        jdcNgaySinh.setDate(sinhVien.getNgay_sinh());

        if(sinhVien.isGioi_tinh()) {
            jrdNam.setSelected(true);
        } else {
            jrdNu.setSelected(true);
        }

        jtfSoDienThoai.setText(sinhVien.getSo_dien_thoai());
        jtaDiaChi.setText(sinhVien.getDia_chi());
        jcbTinhTrang.setSelected(sinhVien.isTinh_trang());
        
        setEvent();
    }
    
    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {  
                if(jtfHoTen.getText().length() == 0 || jdcNgaySinh.getDate() == null) {
                    jlbMsg.setText("Vui lòng nhập đầy đủ thông tin");
                } else {
                                       
                    sinhVien.setHo_ten(jtfHoTen.getText());
                    sinhVien.setNgay_sinh(jdcNgaySinh.getDate());
                    sinhVien.setGioi_tinh(jrdNam.isSelected());
                    sinhVien.setSo_dien_thoai(jtfSoDienThoai.getText());
                    sinhVien.setDia_chi(jtaDiaChi.getText());
                    sinhVien.setTinh_trang(jcbTinhTrang.isSelected());

                    

                    int lastId = sinhVienService.createOrUpdate(sinhVien);
                    if(lastId > 0) {                       
                        sinhVien.setMa_sinh_vien(lastId);   
                        String lastIdString = String.valueOf(lastId);     
                        jtfMaSinhVien.setText( "PKA" + lastId);
                        jlbMsg.setText("Lưu dữ liệu thành công!");
                    }
                }
            }

            
            
            // Khi di chuột vào, đổi màu nút "Lưu dữ liệu"
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            // Khi chuột đi ra, đổi màu nút "Lưu dữ liệu"
            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
                
            }
        });

    
        
    }  

  }



  