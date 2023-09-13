package BT4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    String noiDen;
    int soNgayDi;

    public ChuyenXeNgoaiThanh(String masoChuyen, String tenTX, String soXe, int doanhThu, String noiDen, int soNgayDi) {
        super(masoChuyen, tenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

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
