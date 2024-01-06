package BT5;

public abstract class CaNhan {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;

    /**
     * Khởi tạo một cá nhân với thông tin cơ bản.
     *
     * @param hoTen  Họ tên của cá nhân.
     * @param tuoi   Tuổi của cá nhân.
     * @param diaChi Địa chỉ của cá nhân.
     * @param sdt    Số điện thoại của cá nhân.
     */
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    /**
     * Lấy họ tên của cá nhân.
     *
     * @return Họ tên của cá nhân.
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * Đặt họ tên mới cho cá nhân.
     *
     * @param hoTen Họ tên mới.
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * Lấy tuổi của cá nhân.
     *
     * @return Tuổi của cá nhân.
     */
    public int getTuoi() {
        return tuoi;
    }

    /**
     * Đặt tuổi mới cho cá nhân.
     *
     * @param tuoi Tuổi mới.
     */
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    /**
     * Lấy địa chỉ của cá nhân.
     *
     * @return Địa chỉ của cá nhân.
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * Đặt địa chỉ mới cho cá nhân.
     *
     * @param diaChi Địa chỉ mới.
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * Lấy số điện thoại của cá nhân.
     *
     * @return Số điện thoại của cá nhân.
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * Đặt số điện thoại mới cho cá nhân.
     *
     * @param sdt Số điện thoại mới.
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    /**
     * Phương thức trừu tượng để hiển thị thông tin cá nhân. Các lớp con sẽ cung cấp hiển thị cụ thể.
     *
     * @return Chuỗi chứa thông tin cá nhân.
     */
    public abstract String HienThiTT();
}
