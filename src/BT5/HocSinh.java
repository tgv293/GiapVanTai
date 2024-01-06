package BT5;

public class HocSinh extends CaNhan {
    private String lop; // Lớp học mà học sinh đang theo học
    private String nangKhieu; // Năng khiếu hoặc sở thích của học sinh

    /**
     * Khởi tạo một đối tượng HocSinh với thông tin cơ bản và thông tin lớp học, năng khiếu.
     *
     * @param hoTen     Họ tên của học sinh.
     * @param tuoi      Tuổi của học sinh.
     * @param diaChi    Địa chỉ của học sinh.
     * @param sdt       Số điện thoại của học sinh.
     * @param lop       Lớp học mà học sinh đang theo học.
     * @param nangKhieu Năng khiếu hoặc sở thích của học sinh.
     */
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    /**
     * Lấy lớp học mà học sinh đang theo học.
     *
     * @return Lớp học của học sinh.
     */
    public String getLop() {
        return lop;
    }

    /**
     * Đặt lớp học mà học sinh đang theo học.
     *
     * @param lop Lớp học mới.
     */
    public void setLop(String lop) {
        this.lop = lop;
    }

    /**
     * Lấy thông tin về năng khiếu hoặc sở thích của học sinh.
     *
     * @return Năng khiếu hoặc sở thích của học sinh.
     */
    public String getNangKhieu() {
        return nangKhieu;
    }

    /**
     * Đặt thông tin về năng khiếu hoặc sở thích của học sinh.
     *
     * @param nangKhieu Năng khiếu hoặc sở thích mới.
     */
    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    /**
     * Phương thức ghi đè để hiển thị thông tin của học sinh.
     *
     * @return Chuỗi chứa thông tin cá nhân và thông tin học sinh.
     */
    @Override
    public String HienThiTT() {
        return "Họ tên: " + getHoTen() + ", Tuổi: " + getTuoi() + ", Địa chỉ: " + getDiaChi() + ", SĐT: " + getSdt() +
                ", Lớp: " + lop + ", Năng khiếu: " + nangKhieu;
    }
}
