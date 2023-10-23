package A6;

/**
 * Lớp UI1 đại diện cho một giao diện người dùng để thao tác với dữ liệu sản phẩm thông qua DataAccess.
 * UI1 sử dụng DataAccessFactory để lấy DataAccess tương ứng với loại "type1".
 */
public class UI1 {
    private DataAccess dataAccess; // Thể hiện DataAccess để thao tác với dữ liệu sản phẩm

    /**
     * Constructor của UI1 khởi tạo UI1 và liên kết với DataAccess tương ứng với loại "type1".
     */
    public UI1() {
        this.dataAccess = DataAccessFactory.getDataAccess("type1");
    }

    /**
     * Phương thức này thêm một sản phẩm vào danh sách thông qua DataAccess.
     *
     * @param sanPham Sản phẩm cần thêm
     */
    public void themSanPham(SanPham sanPham) {
        dataAccess.them(sanPham);
    }

    /**
     * Phương thức này xóa một sản phẩm khỏi danh sách thông qua DataAccess.
     *
     * @param sanPham Sản phẩm cần xóa
     */
    public void xoaSanPham(SanPham sanPham) {
        dataAccess.xoa(sanPham);
    }

    /**
     * Phương thức này cập nhật thông tin của một sản phẩm trong danh sách thông qua DataAccess.
     *
     * @param sanPhamCu  Sản phẩm cần cập nhật
     * @param sanPhamMoi Sản phẩm mới
     */
    public void capNhatSanPham(SanPham sanPhamCu, SanPham sanPhamMoi) {
        dataAccess.capNhat(sanPhamCu, sanPhamMoi);
    }

    /**
     * Phương thức này hiển thị danh sách sản phẩm thông qua DataAccess.
     */
    public void hienThiSanPham() {
        dataAccess.hienThiSanPham();
    }
}
