package qlsv.dao;

import java.util.List;
import qlsv.bean.KhoaHocBean;
import qlsv.bean.LopHocBean;

/**
 *
 * @author trand
 */
public interface ThongKeDAO {
    
    public List<LopHocBean> getListByLopHoc();

    public List<KhoaHocBean> getListByKhoaHoc();

}
