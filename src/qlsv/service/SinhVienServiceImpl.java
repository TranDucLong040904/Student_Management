package qlsv.service;

import java.util.List;
import qlsv.dao.SinhVienDAO;
import qlsv.dao.SinhVienDAOImpl;
import qlsv.model.SinhVien;

/**
 *
 * @author trand
 */
public class SinhVienServiceImpl implements SinhVienService {
    private SinhVienDAO sinhVienDAO = null;

    public SinhVienServiceImpl() {
        sinhVienDAO = new SinhVienDAOImpl();
    }

    @Override
    public List<SinhVien> getList() {
        return sinhVienDAO.getList();
    }

    @Override
    public int createOrUpdate(SinhVien sinhVien) {
        return sinhVienDAO.createOrUpdate(sinhVien);
    }
    

}
