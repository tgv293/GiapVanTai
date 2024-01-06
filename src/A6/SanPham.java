package A6;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double donGia;

    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + getMaSanPham() +
                "\nTên sản phẩm: " + getTenSanPham() +
                "\nSố lượng: " + getSoLuong() +
                "\nĐơn giá: " + getDonGia() +
                "\n-------------------------\n";
    }
}
