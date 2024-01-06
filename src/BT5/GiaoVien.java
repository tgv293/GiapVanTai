package BT5;

public class GiaoVien extends CaNhan {
    private String monDay; // Môn học mà giáo viên dạy
    private String toBoMon; // Tổ bộ môn mà giáo viên thuộc

    /**
     * Khởi tạo một đối tượng GiáoVien với thông tin cơ bản và thông tin môn dạy, tổ bộ môn.
     *
     * @param hoTen   Họ tên của giáo viên.
     * @param tuoi    Tuổi của giáo viên.
     * @param diaChi  Địa chỉ của giáo viên.
     * @param sdt     Số điện thoại của giáo viên.
     * @param monDay  Môn học mà giáo viên dạy.
     * @param toBoMon Tổ bộ môn mà giáo viên thuộc.
     */
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    /**
     * Lấy môn học mà giáo viên dạy.
     *
     * @return Môn học mà giáo viên dạy.
     */
    public String getMonDay() {
        return monDay;
    }

    /**
     * Đặt môn học mà giáo viên dạy.
     *
     * @param monDay Môn học mới.
     */
    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    /**
     * Lấy tổ bộ môn mà giáo viên thuộc.
     *
     * @return Tổ bộ môn mà giáo viên thuộc.
     */
    public String getToBoMon() {
        return toBoMon;
    }

    /**
     * Đặt tổ bộ môn mà giáo viên thuộc.
     *
     * @param toBoMon Tổ bộ môn mới.
     */
    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    /**
     * Phương thức ghi đè để hiển thị thông tin của giáo viên.
     *
     * @return Chuỗi chứa thông tin cá nhân và thông tin giáo viên.
     */
    @Override
    public String HienThiTT() {
        return "Họ tên: " + getHoTen() + ", Tuổi: " + getTuoi() + ", Địa chỉ: " + getDiaChi() + ", SĐT: " + getSdt() +
                ", Môn dạy: " + monDay + ", Tổ bộ môn: " + toBoMon;
    }
}
