package qlsv.service;

import qlsv.dao.TaiKhoanDAO;
import qlsv.dao.TaiKhoanDAOImpl;
import qlsv.model.TaiKhoan;

/**
 *
 * @author trand
 */
public class TaiKhoanServiceImpl implements TaiKhoanService {
    
    private TaiKhoanDAO taiKhoanDAO = null;

    public TaiKhoanServiceImpl() {
        taiKhoanDAO = new TaiKhoanDAOImpl();
    }
    

    @Override
    public TaiKhoan login(String tdn, String mk) {
        return taiKhoanDAO.login(tdn, mk);
    }
}
