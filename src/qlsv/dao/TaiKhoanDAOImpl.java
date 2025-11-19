package qlsv.dao;

// Cung cấp một kết nối với cơ sở dữ liệu
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import qlsv.model.TaiKhoan;


/**
 *
 * @author trand
 */

 // Khai báo class TaiKhoanDAOImpl thực thi nhiệm vụ từ interface TaiKhoanDAO
public class TaiKhoanDAOImpl implements  TaiKhoanDAO {
    @Override
    /*
     * Phương thức là login
     * Đối tượng là TaiKhoan
     */
    public TaiKhoan login(String tdn, String mk) {

        // Sử dụng phương thức getConnection() từ class DBConnect để kết nối với cơ sở dữ liệu
        Connection cons = DBConnect.getConnection();
        // Câu lệnh truy vấn SQL, chọn tất cả thông tin từ bảng tai_khoan: tên đăng nhập, mật khẩu
        String sql = "SELECT * FROM tai_khoan WHERE ten_dang_nhap = ? AND mat_khau = ?";
        
        TaiKhoan taiKhoan = null;
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, tdn);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                taiKhoan = new TaiKhoan();
                taiKhoan.setMa_tai_khoan(rs.getInt("ma_tai_khoan"));
                taiKhoan.setTen_dang_nhap(rs.getString("ten_dang_nhap"));
                taiKhoan.setMat_khau(rs.getString("mat_khau"));
                taiKhoan.setTinh_trang(rs.getBoolean("tinh_trang"));
            }
            ps.close();
            cons.close();
            return taiKhoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
