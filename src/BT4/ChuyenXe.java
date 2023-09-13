package BT4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.

public class ChuyenXe {
    String masoChuyen, tenTX, soXe;
    int doanhThu;

    public ChuyenXe(String masoChuyen, String tenTX, String soXe, int doanhThu) {
        this.masoChuyen = masoChuyen;
        this.tenTX = tenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMasoChuyen() {
        return masoChuyen;
    }

    public void setMasoChuyen(String masoChuyen) {
        this.masoChuyen = masoChuyen;
    }

    public String getTenTX() {
        return tenTX;
    }

    public void setTenTX(String tenTX) {
        this.tenTX = tenTX;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
}
