package A6;

/**
 * Lớp UI3 tương tự UI1 và UI2, đại diện cho một giao diện người dùng để thao tác với dữ liệu sản phẩm thông qua DataAccess.
 * UI3 sử dụng DataAccessFactory để lấy DataAccess tương ứng với loại "type1".
 */
public class UI3 {
    private DataAccess dataAccess; // Thể hiện DataAccess để thao tác với dữ liệu sản phẩm

    /**
     * Constructor của UI3 khởi tạo UI3 và liên kết với DataAccess tương ứng với loại "type1".
     */
    public UI3() {
        this.dataAccess = DataAccessFactory.getDataAccess("type1");
    }

    // Các phương thức thêm, xóa, cập nhật, và hiển thị sản phẩm được giữ nguyên giống với UI1.
    public void themSanPham(SanPham sanPham) {
        dataAccess.them(sanPham);
    }

    public void xoaSanPham(SanPham sanPham) {
        dataAccess.xoa(sanPham);
    }

    public void capNhatSanPham(SanPham sanPhamCu, SanPham sanPhamMoi) {
        dataAccess.capNhat(sanPhamCu, sanPhamMoi);
    }

    public void hienThiSanPham() {
        dataAccess.hienThiSanPham();
    }
}
