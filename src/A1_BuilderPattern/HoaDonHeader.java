package A1_BuilderPattern;

/**
 * Lớp HoaDonHeader đại diện cho thông tin header của một hóa đơn.
 */
class HoaDonHeader {
    private String soHD; // Số hóa đơn
    private String ngayBan; // Ngày bán hóa đơn
    private String tenKH; // Tên khách hàng

    /**
     * Constructor khởi tạo một đối tượng HoaDonHeader với thông tin số hóa đơn, ngày bán và tên khách hàng.
     *
     * @param soHD    Số hóa đơn
     * @param ngayBan Ngày bán hóa đơn
     * @param tenKH   Tên khách hàng
     */
    public HoaDonHeader(String soHD, String ngayBan, String tenKH) {
        this.soHD = soHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    /**
     * Phương thức này trả về một chuỗi biểu diễn của đối tượng HoaDonHeader, bao gồm số hóa đơn, ngày bán và tên khách hàng.
     *
     * @return Chuỗi biểu diễn của đối tượng HoaDonHeader
     */
    @Override
    public String toString() {
        return "Hóa đơn: " + this.soHD + "\n" +
                "Ngày bán: " + this.ngayBan + "\n" +
                "Khách hàng: " + this.tenKH;
    }
}
