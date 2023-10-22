package CA4_Observer;

public class ThanhVienA implements Topic.ThanhVien {

    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        topic.dangKyThanhVien(this);
    }

    public void huyDangKyThanhVien(){
        topic.huyDangKyThanhVien(this);
    }

    @Override
    public void capNhat(String tin) {
        System.out.println("Thành viên A nhận được: " + tin);
    }
}
