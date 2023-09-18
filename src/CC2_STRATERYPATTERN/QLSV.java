package CC2_STRATERYPATTERN;

import java.util.ArrayList;

public class QLSV {
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    void sapXep() {
        dsSV.sort((a, b) -> soSanh.soSanh(a, b));
    }

    void inDS() {
        for (SinhVien sv : dsSV) {
            System.out.println(sv.hoTen + ", " + sv.ngaySinh + ", " + sv.diemTB);
        }
    }
}
