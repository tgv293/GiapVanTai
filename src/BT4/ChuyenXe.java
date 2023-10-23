package BT4;

/**
 * Lớp ChuyenXe là lớp cơ sở đại diện cho một chuyến xe trong công ty.
 * Có hai loại chuyến xe: nội thành và ngoại thành.
 * Mỗi chuyến xe được định nghĩa bởi mã số chuyến, họ tên tài xế, số xe, và doanh thu.
 */
public class ChuyenXe {
    String masoChuyen, tenTX, soXe;
    int doanhThu;

    /**
     * Constructor khởi tạo một chuyến xe.
     *
     * @param masoChuyen Mã số chuyến.
     * @param tenTX      Họ tên tài xế.
     * @param soXe       Số xe.
     * @param doanhThu   Doanh thu của chuyến xe.
     */
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
