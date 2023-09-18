package BT5;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    QLDS qldsHS = new QLDS();
    QLDS qldsGVGD = new QLDS();

    int themHocSinh(HocSinh hs) {
        qldsHS.them(hs);
        return 1;
    }

    int themGVGD(GiaoVien gv) {
        qldsGVGD.them(gv);
        return 1;
    }

    void inDSHS() {
        qldsHS.inDS();
    }

    void inDSGVGD() {
        qldsGVGD.inDS();
    }
}
