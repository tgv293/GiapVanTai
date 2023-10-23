package A1_BuilderPattern;

/**
 * Lớp CTHD (Chi tiết hóa đơn) đại diện cho thông tin chi tiết về một sản phẩm trong hóa đơn.
 */
class CTHD {
    private String sanPham; // Tên sản phẩm
    private int soLuong; // Số lượng sản phẩm
    private double donGia; // Đơn giá của sản phẩm
    private double chietKhau; // Mức chiết khấu áp dụng cho sản phẩm

    /**
     * Constructor khởi tạo một đối tượng CTHD với thông tin sản phẩm, số lượng, đơn giá và chiết khấu.
     *
     * @param sanPham   Tên sản phẩm
     * @param soLuong   Số lượng sản phẩm
     * @param donGia    Đơn giá của sản phẩm
     * @param chietKhau Mức chiết khấu áp dụng cho sản phẩm
     */
    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    /**
     * Phương thức này trả về một chuỗi biểu diễn của đối tượng CTHD, bao gồm tên sản phẩm, số lượng,
     * đơn giá và chiết khấu.
     *
     * @return Chuỗi biểu diễn của đối tượng CTHD
     */
    @Override
    public String toString() {
        return "Sản phẩm: " + this.sanPham + "\n" +
                "Số lượng: " + this.soLuong + "\n" +
                "Đơn giá: " + this.donGia + "\n" +
                "Chiết khấu: " + this.chietKhau;
    }
}
