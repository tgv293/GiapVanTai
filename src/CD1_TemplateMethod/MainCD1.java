package CD1_TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MainCD1 {
    public static void main(String[] args) {
        // Tạo danh sách các mặt hàng cho giỏ hàng
        List<MatHang> dsHangHoa = new ArrayList<>();
        dsHangHoa.add(new MatHang("Sản phẩm 1", 2, 300000));
        dsHangHoa.add(new MatHang("Sản phẩm 2", 1, 500000));

        // Tạo một phiếu hóa đơn cho khách hàng Kim Cương
        HoaDon hoaDonKimCuong = new HoaDonKHKimCuong();
        hoaDonKimCuong.dsHangHoa = dsHangHoa;
        System.out.println("Hóa đơn khách hàng Kim Cương:");
        hoaDonKimCuong.hienThi();

        // Tạo một phiếu hóa đơn cho khách hàng Thân Thiết
        HoaDon hoaDonThanThiet = new HoaDonKHThanThiet();
        hoaDonThanThiet.dsHangHoa = dsHangHoa;
        System.out.println("\nHóa đơn khách hàng Thân Thiết:");
        hoaDonThanThiet.hienThi();

        // Tạo một phiếu hóa đơn cho khách hàng Vàng
        HoaDon hoaDonVang = new HoaDonKHVang();
        hoaDonVang.dsHangHoa = dsHangHoa;
        System.out.println("\nHóa đơn khách hàng Vàng:");
        hoaDonVang.hienThi();
    }
}
