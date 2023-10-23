package CA4_Observer;

import java.util.*;

/**
 * Lớp Topic đại diện cho một chủ đề hoặc nhóm, và là một phần của mô hình Observer.
 */
public class Topic {
    private List<ThanhVien> danhSachThanhVien = new ArrayList<>();
    private String tin;

    /**
     * Phương thức này dùng để đăng ký một thành viên làm người nghe cho chủ đề.
     *
     * @param thanhVien Đối tượng thành viên.
     */
    public void dangKyThanhVien(ThanhVien thanhVien) {
        if (!danhSachThanhVien.contains(thanhVien))
            danhSachThanhVien.add(thanhVien);
    }

    /**
     * Phương thức này dùng để hủy đăng ký một thành viên khỏi chủ đề.
     *
     * @param thanhVien Đối tượng thành viên.
     */
    public void huyDangKyThanhVien(ThanhVien thanhVien) {
        if (danhSachThanhVien.contains(thanhVien))
            danhSachThanhVien.remove(thanhVien);
    }

    /**
     * Phương thức này gửi thông báo đến tất cả các thành viên trong danh sách để cập nhật tin mới.
     */
    public void thongBaoChoThanhVien() {
        for (ThanhVien thanhVien : danhSachThanhVien) {
            thanhVien.capNhat(tin);
        }
    }

    /**
     * Phương thức này tạo một tin mới cho chủ đề và thông báo cho tất cả thành viên.
     *
     * @param tin Tin mới.
     */
    public void taoTinMoi(String tin) {
        this.tin = tin;
        thongBaoChoThanhVien();
    }

    /**
     * Phương thức này cập nhật tin cho chủ đề và thông báo cho tất cả thành viên.
     *
     * @param tin Tin cần cập nhật.
     */
    public void capNhatTin(String tin) {
        this.tin = tin;
        thongBaoChoThanhVien();
    }

    /**
     * Giao diện ThanhVien đại diện cho người nghe của chủ đề, và nó cần triển khai phương thức để cập nhật thông tin.
     */
    public static interface ThanhVien {
        void capNhat(String tin);
    }
}
