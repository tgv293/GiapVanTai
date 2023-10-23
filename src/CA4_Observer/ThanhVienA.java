package CA4_Observer;

/**
 * Lớp ThanhVienA đại diện cho một thành viên nhận thông báo từ một chủ đề hoặc nhóm (lớp Topic),
 * và là một phần của mô hình Observer.
 */
public class ThanhVienA implements Topic.ThanhVien {

    Topic topic;

    /**
     * Phương thức khởi tạo ThanhVienA và đăng ký nó cho một chủ đề cụ thể.
     * @param topic Chủ đề cụ thể.
     */
    public ThanhVienA(Topic topic) {
        this.topic = topic;
        topic.dangKyThanhVien(this);
    }

    /**
     * Phương thức này dùng để hủy đăng ký thành viên khỏi chủ đề.
     */
    public void huyDangKyThanhVien(){
        topic.huyDangKyThanhVien(this);
    }

    @Override
    public void capNhat(String tin) {
        System.out.println("Thành viên A nhận được: " + tin);
    }
}
