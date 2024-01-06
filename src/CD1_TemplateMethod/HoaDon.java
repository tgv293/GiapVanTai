package CD1_TemplateMethod;

import java.util.List;

public abstract class HoaDon {
    protected List<MatHang> dsHangHoa;

    protected abstract float tinhChietKhau(float tong);

    protected float tinhTien() {
        float tong = 0;
        for (MatHang matHang : dsHangHoa) {
            tong += (float) matHang.thanhTien();
        }
        return tong;
    }

    public void hienThi() {
        float tong = tinhTien();
        float chietKhau = tinhChietKhau(tong);
        float tongSauChietKhau = tong - chietKhau;

        System.out.println("Danh sách mặt hàng:");
        for (MatHang matHang : dsHangHoa) {
            System.out.println("Tên: " + matHang.getTen() + ", Số lượng: " + matHang.getSoLuong() +
                    ", Đơn giá: " + matHang.getDonGia() + ", Thành tiền: " + matHang.thanhTien());
        }

        System.out.println("Tổng tiền mua hàng (chưa tính chiết khấu): " + tong);
        System.out.println("Tiền chiết khấu: " + chietKhau);
        System.out.println("Tổng tiền khách hàng cần thanh toán: " + tongSauChietKhau);
    }

}
