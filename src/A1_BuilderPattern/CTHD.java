package A1_BuilderPattern;

class CTHD {
    private String sanPham;
    private int soLuong;
    private double donGia;
    private double chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + this.sanPham + "\n" +
                "Số lượng: " + this.soLuong + "\n" +
                "Đơn giá: " + this.donGia + "\n" +
                "Chiết khấu: " + this.chietKhau;
    }
}
