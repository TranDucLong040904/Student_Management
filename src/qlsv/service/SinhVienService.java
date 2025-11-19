package qlsv.service;

import java.util.List;

import qlsv.model.SinhVien;

/**
 *
 * @author trand
 */
public interface SinhVienService {
    
    public List<SinhVien> getList();
    public int createOrUpdate(SinhVien sinhVien);
    
}
