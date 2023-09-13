package BT4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.

public class ChuyenXeNoiThanh  extends ChuyenXe{
    String soTuyen;
    String soKM;

    public ChuyenXeNoiThanh(String masoChuyen, String tenTX, String soXe, int doanhThu, String soTuyen, String soKM) {
        super(masoChuyen, tenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

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
