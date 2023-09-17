package BT5;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    List<HocSinh> dsHocSinh;
    List<GiaoVien> dsGiaoVienGD;
    GiaoVien giaoVienCN;

    public LopHoc() {
        dsHocSinh = new ArrayList<>();
        dsGiaoVienGD = new ArrayList<>();
    }

    public int themHocSinh(HocSinh hs) {
        dsHocSinh.add(hs);
        return dsHocSinh.size();
    }

    public int themGVGD(GiaoVien gv) {
        dsGiaoVienGD.add(gv);
        return dsGiaoVienGD.size();
    }

    public int inDSHS() {
        for (HocSinh hs : dsHocSinh) {
            System.out.println(hs.HienThiTT());
        }
        return dsHocSinh.size();
    }

    public int inDSGVGD() {
        for (GiaoVien gv : dsGiaoVienGD) {
            System.out.println(gv.HienThiTT());
        }
        return dsGiaoVienGD.size();
    }
}
