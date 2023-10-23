package A6;

/**
 * Lớp SanPham đại diện cho một sản phẩm trong hệ thống, với các thông tin như mã sản phẩm, tên sản phẩm, số lượng, và đơn giá.
 */
public class SanPham {
    private String maSanPham;  // Mã sản phẩm
    private String tenSanPham; // Tên sản phẩm
    private int soLuong;      // Số lượng sản phẩm
    private double donGia;    // Đơn giá sản phẩm

    /**
     * Constructor để khởi tạo một sản phẩm với thông tin cụ thể.
     *
     * @param maSanPham  Mã sản phẩm
     * @param tenSanPham Tên sản phẩm
     * @param soLuong    Số lượng sản phẩm
     * @param donGia     Đơn giá sản phẩm
     */
    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    /**
     * Phương thức getter để lấy mã sản phẩm.
     *
     * @return Mã sản phẩm
     */
    public String getMaSanPham() {
        return maSanPham;
    }

    /**
     * Phương thức setter để thiết lập mã sản phẩm.
     *
     * @param maSanPham Mã sản phẩm
     */
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    /**
     * Phương thức getter để lấy tên sản phẩm.
     *
     * @return Tên sản phẩm
     */
    public String getTenSanPham() {
        return tenSanPham;
    }

    /**
     * Phương thức setter để thiết lập tên sản phẩm.
     *
     * @param tenSanPham Tên sản phẩm
     */
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    /**
     * Phương thức getter để lấy số lượng sản phẩm.
     *
     * @return Số lượng sản phẩm
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * Phương thức setter để thiết lập số lượng sản phẩm.
     *
     * @param soLuong Số lượng sản phẩm
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * Phương thức getter để lấy đơn giá sản phẩm.
     *
     * @return Đơn giá sản phẩm
     */
    public double getDonGia() {
        return donGia;
    }

    /**
     * Phương thức setter để thiết lập đơn giá sản phẩm.
     *
     * @param donGia Đơn giá sản phẩm
     */
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
