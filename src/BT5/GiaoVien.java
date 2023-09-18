package BT5;

public class GiaoVien extends CaNhan {
    private String monDay;
    private String toBoMon;

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return "Họ tên: " + getHoTen() + ", Tuổi: " + getTuoi() + ", Địa chỉ: " + getDiaChi() + ", SĐT: " + getSdt() + ", Môn dạy: " + monDay + ", Tổ bộ môn: " + toBoMon;
    }
}
