package BT4;

/**
 * Lớp ChuyenXeNoiThanh là một loại chuyến xe nội thành mở rộng từ lớp ChuyenXe.
 * Chuyến xe nội thành có thêm thông tin về số tuyến và số km đi được.
 */
public class ChuyenXeNoiThanh extends ChuyenXe {
    String soTuyen;
    String soKM;

    /**
     * Constructor khởi tạo một chuyến xe nội thành.
     *
     * @param masoChuyen Mã số chuyến.
     * @param tenTX      Họ tên tài xế.
     * @param soXe       Số xe.
     * @param doanhThu   Doanh thu của chuyến xe.
     * @param soTuyen    Số tuyến của chuyến xe nội thành.
     * @param soKM       Số km đi được.
     */
    public ChuyenXeNoiThanh(String masoChuyen, String tenTX, String soXe, int doanhThu, String soTuyen, String soKM) {
        super(masoChuyen, tenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    /**
     * Phương thức toString để hiển thị thông tin chi tiết của chuyến xe nội thành.
     *
     * @return Chuỗi chứa thông tin chi tiết về chuyến xe nội thành.
     */
    @Override
    public String toString() {
        return "Ma so CX: " + masoChuyen + "\n"
                + "Ho ten Lai Xe: " + tenTX + "\n"
                + "So Xe: " + soXe + "\n"
                + "Doanh thu: " + doanhThu + "\n"
                + "So tuyen: " + soTuyen + "\n"
                + "So KM: " + soKM;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public String getSoKM() {
        return soKM;
    }

    public void setSoKM(String soKM) {
        this.soKM = soKM;
    }
}
