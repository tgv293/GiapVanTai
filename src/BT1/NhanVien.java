package BT1;

public class NhanVien {
    String ten, diaChi;
    int tongSoGioLam, tuoi;
    double tienLuong;

    public NhanVien(String ten, String diaChi, int tongSoGioLam, int tuoi, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tongSoGioLam = tongSoGioLam;
        this.tuoi = tuoi;
        this.tienLuong = tienLuong;
    }

    public String getThongTin() {
        return "Họ tên: " + this.ten + "\n"+
                "Tuổi: " + this.tuoi + "\n"+
                "Địa chỉ: " + this.diaChi + "\n"+
                "Tổng số giờ làm: " + this.tongSoGioLam + "\n"+
                "Tiền lương: " + this.tienLuong + "\n";
    }

    public double tienThuong() {
        if (tongSoGioLam < 100)
            return 0;
        if (tongSoGioLam < 200)
            return tienLuong * 0.1;
        return tienLuong * 0.2;
    }

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
