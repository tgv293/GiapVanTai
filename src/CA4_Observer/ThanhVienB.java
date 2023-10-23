package CA4_Observer;

import java.util.*;

/**
 * Lớp ThanhVienB đại diện cho một thành viên nhận thông báo từ một chủ đề hoặc nhóm (lớp Topic),
 * và là một phần của mô hình Observer.
 */
public class ThanhVienB implements Topic.ThanhVien {
    private List<String> danhSachTin = new ArrayList<>();

    Topic topic;

    /**
     * Phương thức khởi tạo ThanhVienB và đăng ký nó cho một chủ đề cụ thể.
     *
     * @param topic Chủ đề cụ thể.
     */
    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.dangKyThanhVien(this);
    }

    /**
     * Phương thức này dùng để hủy đăng ký thành viên khỏi chủ đề.
     */
    public void huyDangKyThanhVien() {
        topic.huyDangKyThanhVien(this);
    }

    @Override
    public void capNhat(String tin) {
        danhSachTin.add(tin);
        System.out.println("Thành viên B nhận được: " + tin);
        System.out.println("Tất cả các tin đã nhận bởi Thành viên B: " + danhSachTin);
    }
}
