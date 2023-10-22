package CA4_Observer;

import java.util.*;

public class Topic {
    private List<ThanhVien> danhSachThanhVien = new ArrayList<>();
    private String tin;

    public void dangKyThanhVien(ThanhVien thanhVien) {
        if (!danhSachThanhVien.contains(thanhVien))
            danhSachThanhVien.add(thanhVien);
    }

    public void huyDangKyThanhVien(ThanhVien thanhVien) {
        if (danhSachThanhVien.contains(thanhVien))
            danhSachThanhVien.remove(thanhVien);
    }

    public void thongBaoChoThanhVien() {
        for (ThanhVien thanhVien : danhSachThanhVien) {
            thanhVien.capNhat(tin);
        }
    }

    public void taoTinMoi(String tin) {
        this.tin = tin;
        thongBaoChoThanhVien();
    }

    public void capNhatTin(String tin) {
        this.tin = tin;
        thongBaoChoThanhVien();
    }

    public static interface ThanhVien {
        void capNhat(String tin);
    }
}