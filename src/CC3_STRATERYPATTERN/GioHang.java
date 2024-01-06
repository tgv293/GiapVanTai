package CC3_STRATERYPATTERN;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    List<MatHang> dsMH = new ArrayList<>();
    IThanhToan hinhThucTT;
    IVanChuyen hinhThucVC;
    IKhuyenMai hinhThucKM;

    public void them(MatHang mh) {
        dsMH.add(mh);
    }

    public void thanhToan() {
        float tong = 0;
        for (MatHang mh : dsMH) {
            tong += mh.soLuong * mh.donGia;
        }
        float tienKM = hinhThucKM.khuyenMai(tong);
        float kmThanhToan = hinhThucTT.thanhToan(tong);
        float phiVC = hinhThucVC.phiVanChuyen();
        int thoiGianGiao = hinhThucVC.thoiGianGiao();

        System.out.println("Tổng tiền hàng: " + tong);
        System.out.println("Tiền được giảm khuyến mãi: " + tienKM);
        System.out.println("Tiền được giảm thanh toán: " + (tong - tienKM - kmThanhToan));
        System.out.println("Phí vận chuyển: " + phiVC);
        System.out.println("Tổng tiền phải trả: " + (kmThanhToan - tienKM + phiVC));
        System.out.println("Thời gian dự kiến nhận hàng: " + thoiGianGiao + " ngày");
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void setHinhThucVC(IVanChuyen hinhThucVC) {
        this.hinhThucVC = hinhThucVC;
    }

    public void setHinhThucKM(IKhuyenMai hinhThucKM) {
        this.hinhThucKM = hinhThucKM;
    }

}
