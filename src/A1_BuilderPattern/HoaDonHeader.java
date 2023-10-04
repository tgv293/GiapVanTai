package A1_BuilderPattern;

class HoaDonHeader {
    private String soHD, ngayBan, tenKH;

    public HoaDonHeader(String soHD, String ngayBan, String tenKH) {
        this.soHD = soHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "Hóa đơn: " + this.soHD + "\n" +
                "Ngày bán: " + this.ngayBan + "\n" +
                "Khách hàng: " + this.tenKH;

    }
}
