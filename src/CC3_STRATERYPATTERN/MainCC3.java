package CC3_STRATERYPATTERN;

public class MainCC3 {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();

        // Thêm mặt hàng vào giỏ hàng
        gioHang.them(new MatHang("Mat hang 1", 2, 1000000));
        gioHang.them(new MatHang("Mat hang 2", 3, 2000000));

        // Chọn hình thức thanh toán và đơn vị vận chuyển
        gioHang.hinhThucTT = new COD();
        gioHang.hinhThucVC = new GiaoHangNhanh();

        // Thanh toán
        gioHang.thanhToan();
    }
}
