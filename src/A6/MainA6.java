package A6;

/**
 * Lớp MainA6 là lớp chứa hàm main để kiểm tra các giao diện người dùng (UI1, UI2, UI3) và thao tác với sản phẩm.
 * Các sản phẩm được thêm, xóa và cập nhật thông qua các giao diện này.
 */
public class MainA6 {
    public static void main(String[] args) {
        UI1 ui1 = new UI1();
        UI2 ui2 = new UI2();
        UI3 ui3 = new UI3();

        SanPham sp1 = new SanPham("SP01", "Sản phẩm 01", 10, 10000.0);
        ui1.themSanPham(sp1);

        SanPham sp2 = new SanPham("SP02", "Sản phẩm 02", 20, 20000.0);
        ui2.themSanPham(sp2);

        SanPham sp3 = new SanPham("SP03", "Sản phẩm 03", 30, 30000.0);
        ui3.themSanPham(sp3);

        System.out.println("Các sản phẩm mới được thêm vào: ");
        ui1.hienThiSanPham();
        ui2.hienThiSanPham();
        ui3.hienThiSanPham();

        // Xóa sản phẩm
        ui2.xoaSanPham(sp2);

        System.out.println("Các sản phẩm hiện tại sau khi xóa 1 sản phẩm: ");
        ui1.hienThiSanPham();
        ui2.hienThiSanPham();
        ui3.hienThiSanPham();

        // Cập nhật sản phẩm
        SanPham sp1Moi = new SanPham("SP01", "Sản phẩm 01 mới", 15, 15000.0);
        ui1.capNhatSanPham(sp1, sp1Moi);

        SanPham sp3Moi = new SanPham("SP03", "Sản phẩm 03 mới", 35, 35000.0);
        ui3.capNhatSanPham(sp3, sp3Moi);

        System.out.println("Các sản phẩm hiện tại sau khi cập nhật: ");
        ui1.hienThiSanPham();
        ui2.hienThiSanPham();
        ui3.hienThiSanPham();
    }
}
