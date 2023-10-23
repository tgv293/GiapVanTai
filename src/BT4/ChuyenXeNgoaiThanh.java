package BT4;

/**
 * Lớp ChuyenXeNgoaiThanh là một loại chuyến xe ngoại thành mở rộng từ lớp ChuyenXe.
 * Chuyến xe ngoại thành có thêm thông tin về nơi đến và số ngày đi.
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    String noiDen;
    int soNgayDi;

    /**
     * Constructor khởi tạo một chuyến xe ngoại thành.
     *
     * @param masoChuyen Mã số chuyến.
     * @param tenTX      Họ tên tài xế.
     * @param soXe       Số xe.
     * @param doanhThu   Doanh thu của chuyến xe.
     * @param noiDen     Nơi đến của chuyến xe ngoại thành.
     * @param soNgayDi   Số ngày đi.
     */
    public ChuyenXeNgoaiThanh(String masoChuyen, String tenTX, String soXe, int doanhThu, String noiDen, int soNgayDi) {
        super(masoChuyen, tenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    /**
     * Phương thức toString để hiển thị thông tin chi tiết của chuyến xe ngoại thành.
     *
     * @return Chuỗi chứa thông tin chi tiết về chuyến xe ngoại thành.
     */
    @Override
    public String toString() {
        return "Ma so CX: " + masoChuyen + "\n"
                + "Ho ten Lai Xe: " + tenTX + "\n"
                + "So Xe: " + soXe + "\n"
                + "Doanh thu: " + doanhThu + "\n"
                + "Nơi đến: " + noiDen + "\n"
                + "Số ngày đi: " + soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
}
