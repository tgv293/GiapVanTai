package CA4_Observer;

import java.util.*;

public class ThanhVienB implements Topic.ThanhVien {
    private List<String> danhSachTin = new ArrayList<>();

    Topic topic;

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.dangKyThanhVien(this);
    }

    public void huyDangKyThanhVien(){
        topic.huyDangKyThanhVien(this);
    }

    @Override
    public void capNhat(String tin) {
        danhSachTin.add(tin);
        System.out.println("Thành viên B nhận được: " + tin);
        System.out.println("Tất cả các tin đã nhận bởi Thành viên B: " + danhSachTin);
    }
}
