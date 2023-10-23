package BT1;

/**
 * Lớp NhanVien đại diện cho thông tin của một nhân viên bao gồm tên,
 * địa chỉ, tổng số giờ làm việc, tuổi và tiền lương.
 */
public class NhanVien {
    String ten, diaChi;
    int tongSoGioLam, tuoi;
    double tienLuong;

    /**
     * Constructor để khởi tạo đối tượng NhanVien.
     *
     * @param ten          Tên của nhân viên.
     * @param diaChi       Địa chỉ của nhân viên.
     * @param tongSoGioLam Tổng số giờ làm của nhân viên.
     * @param tuoi         Tuổi của nhân viên.
     * @param tienLuong    Tiền lương của nhân viên.
     */
    public NhanVien(String ten, String diaChi, int tongSoGioLam, int tuoi, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tongSoGioLam = tongSoGioLam;
        this.tuoi = tuoi;
        this.tienLuong = tienLuong;
    }

    /**
     * Phương thức trả về thông tin đầy đủ của nhân viên dưới dạng chuỗi.
     *
     * @return Chuỗi chứa thông tin của nhân viên.
     */
    public String getThongTin() {
        return "Họ tên: " + this.ten + "\n" +
                "Tuổi: " + this.tuoi + "\n" +
                "Địa chỉ: " + this.diaChi + "\n" +
                "Tổng số giờ làm: " + this.tongSoGioLam + "\n" +
                "Tiền lương: " + this.tienLuong + "\n";
    }

    /**
     * Phương thức tính toán tiền thưởng của nhân viên dựa trên số giờ làm.
     *
     * @return Tiền thưởng của nhân viên.
     */
    public double tienThuong() {
        if (tongSoGioLam < 100)
            return 0;
        if (tongSoGioLam < 200)
            return tienLuong * 0.1;
        return tienLuong * 0.2;
    }

    // Các phương thức getter và setter cho các thuộc tính của nhân viên.
    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
}
