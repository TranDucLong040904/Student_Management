# 🎓 HỆ THỐNG QUẢN LÝ ĐÀO TẠO ĐẠI HỌC

Đây là Bài tập lớn môn **Lập Trình Hướng Đối Tượng (OOP)**, xây dựng một **Hệ thống Quản lý Đào tạo Đại học** nhằm tự động hóa và tối ưu hóa các quy trình quản lý thông tin sinh viên, giảng viên và khóa học. Dự án được phát triển bằng ngôn ngữ **Java** với giao diện đồ họa sử dụng **Java Swing**.

---

## ✨ Mục tiêu & Tính năng Chính

Hệ thống được xây dựng để giải quyết vấn đề quản lý thủ công đang gây khó khăn và tiềm ẩn nhiều sai sót tại các trường đại học.

### Mục tiêu

* Xây dựng hệ thống quản lý đào tạo toàn diện và hiệu quả bằng ngôn ngữ **Java**.

### Tính năng (Chức năng)

| Chức năng | Mô tả |
| :--- | :--- |
| **Đăng nhập (Login)** | Bắt buộc người dùng phải có tài khoản và mật khẩu để truy cập hệ thống. |
| **Quản lý Sinh viên/Giảng viên** | Xem, theo dõi thông tin, và điều chỉnh thông tin bằng các thao tác **Thêm, Sửa, Xóa**. |
| **Tìm kiếm** | Tìm kiếm nhanh chóng thông tin theo Mã, Tên, Ngày sinh. |
| **Thống kê Dữ liệu** | Phân tích và trình bày các thông tin liên quan đến số lượng sinh viên và khóa học qua biểu đồ. |

---

## 🛠️ Công nghệ sử dụng

Dự án được xây dựng trên nền tảng Java và các công cụ hỗ trợ phát triển:

* **Java:** Ngôn ngữ lập trình hướng đối tượng (OOP).
* **Java Swing:** Thư viện GUI (Graphical User Interface) tích hợp trong Java Foundation Classes (JFC) để xây dựng giao diện desktop.
* **Apache NetBeans:** Môi trường phát triển tích hợp (IDE) mạnh mẽ để phát triển ứng dụng Java.
* **Navicat:** Phần mềm quản trị cơ sở dữ liệu (DBMS) toàn diện, sử dụng giao diện đồ họa trực quan.

---

## 🚀 Hướng dẫn Cài đặt & Chạy Project

### Cấu trúc Mã nguồn

Cấu trúc thư mục dự án tuân thủ mô hình **MVC** (Model-View-Controller) và **DAO** (Data Access Object) trong package `qlsv`:

```text

│   .gitignore
│   build.xml
│   README.md
│
├───dist
│   │   QuanLiSinhVien_Beta3-B8.jar   # File chạy chính của ứng dụng
│   └───lib
│       └───... (Các file .jar thư viện)
│
└───src
    └───qlsv
        ├───bean          # Các lớp Bean dùng cho việc hiển thị thống kê
        ├───controller    # Xử lý logic và điều hướng màn hình (ChuyenManHinhController)
        ├───dao           # Data Access Object: Kết nối CSDL (DBConnect, SinhVienDAO, GiangVienDAO)
        ├───images        # Chứa icon và ảnh giao diện (dang_nhap.png, main_menu_*.png)
        ├───main          # Lớp Main khởi động ứng dụng
        ├───model         # Các lớp mô hình dữ liệu (GiangVien, SinhVien, TaiKhoan, KhoaHoc)
        ├───service       # Lớp Service: Xử lý nghiệp vụ (GiangVienService, SinhVienService)
        ├───utility       # Hỗ trợ hiển thị dữ liệu (ClassTableModel)
        └───view          # Giao diện người dùng (JFrame/JPanel) (DangNhapJDialog, MainJFrame, SinhVienJPanel)
```
---
## Hướng dẫn chạy
1. Clone repository về máy.

2. Cài đặt CSDL: Import file db_qlsv.sql (nằm trong thư mục src/Lib) vào MySQL hoặc hệ quản trị cơ sở dữ liệu tương ứng.

3. Mở Project: Mở dự án bằng Apache NetBeans.

4. Chạy ứng dụng: Biên dịch và chạy file Main.java (hoặc chạy trực tiếp file .jar trong thư mục dist).

5. Đăng nhập: Sử dụng tài khoản và mật khẩu đã được cài đặt trong CSDL (Ví dụ: Tài khoản: long, Mật khẩu: 040904).

--- 

## 🖼️ Thiết kế Giao diện (Demo)
1. Giao diện Đăng nhập
2. Giao diện Chính
3. Giao diện Thống kê Dữ liệu
Hiển thị biểu đồ thống kê trực quan về số lượng sinh viên đăng ký theo ngày và thời gian diễn ra các khóa học.

--- 

## 📜 Giấy phép (License)
Dự án này được cung cấp miễn phí sử dụng cho mục đích học tập, nghiên cứu và tham khảo cá nhân. Vui lòng không sử dụng cho mục đích thương mại mà không có sự cho phép.
