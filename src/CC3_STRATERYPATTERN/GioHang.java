package CC3_STRATERYPATTERN;

import java.util.ArrayList;

public class GioHang {
    ArrayList<MatHang> dsMH = new ArrayList<>();
    IThanhToan hinhThucTT;
    IVanChuyen hinhThucVC;

    void them(MatHang mh) {
        dsMH.add(mh);
    }

    float tongTien() {
        float tong = 0;
        for (MatHang mh : dsMH) {
            tong += mh.soLuong * mh.donGia;
        }
        return tong;
    }

    void thanhToan() {
        float tienHang = tongTien();
        float tienGiam = hinhThucTT.thanhToan(tienHang);
        float phiVC = hinhThucVC.phiVanChuyen();
        int thoiGianGiao = hinhThucVC.thoiGianGiao();

        System.out.println("Tổng tiền hàng: " + tienHang);
        System.out.println("Tiền được giảm khi thanh toán: " + (tienHang - tienGiam));
        System.out.println("Phí vận chuyển: " + phiVC);
        System.out.println("Tổng tiền cần thanh toán: " + (tienGiam + phiVC));
        System.out.println("Thời gian dự kiến nhận hàng: " + thoiGianGiao + " ngày");
    }
}
