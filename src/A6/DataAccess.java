package A6;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp DataAccess đại diện cho quản lý dữ liệu sản phẩm, sử dụng mô hình Singleton.
 */
public class DataAccess {
    private static DataAccess instance; // Thể hiện duy nhất của DataAccess
    private List<SanPham> sanPhams; // Danh sách sản phẩm

    /**
     * Constructor ẩn định của lớp DataAccess để khởi tạo danh sách sản phẩm.
     */
    public DataAccess() {
        sanPhams = new ArrayList<>();
    }

    /**
     * Phương thức này trả về thể hiện duy nhất của DataAccess và đảm bảo tính đồng bộ.
     *
     * @return Thể hiện duy nhất của DataAccess
     */
    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }

    /**
     * Phương thức này thêm một sản phẩm vào danh sách.
     *
     * @param sanPham Sản phẩm cần thêm
     */
    public void them(SanPham sanPham) {
        sanPhams.add(sanPham);
    }

    /**
     * Phương thức này xóa một sản phẩm khỏi danh sách.
     *
     * @param sanPham Sản phẩm cần xóa
     */
    public void xoa(SanPham sanPham) {
        sanPhams.remove(sanPham);
    }

    /**
     * Phương thức này cập nhật thông tin của một sản phẩm trong danh sách.
     *
     * @param sanPhamCu Sản phẩm cần cập nhật
     * @param sanPhamMoi Sản phẩm mới
     */
    public void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi) {
        int index = sanPhams.indexOf(sanPhamCu);
        if (index != -1) {
            sanPhams.set(index, sanPhamMoi);
        }
    }

    /**
     * Phương thức này hiển thị thông tin về tất cả sản phẩm trong danh sách.
     */
    public void hienThiSanPham() {
        for (SanPham sp : sanPhams) {
            System.out.println("Mã sản phẩm: " + sp.getMaSanPham());
            System.out.println("Tên sản phẩm: " + sp.getTenSanPham());
            System.out.println("Số lượng: " + sp.getSoLuong());
            System.out.println("Đơn giá: " + sp.getDonGia());
            System.out.println("-------------------------");
        }
    }
}
