package qlsv.dao;

import java.util.List;

import qlsv.model.SinhVien;

/**
 *
 * @author trand
 */
public interface SinhVienDAO {
    
    public List<SinhVien> getList();
    public int createOrUpdate(SinhVien sinhVien);
}
