package BT5;

public class HocSinh extends CaNhan {
    String lop;
    String nangKhieu;

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return "Họ tên: " + hoTen + ", Tuổi: " + tuoi + ", Địa chỉ: " + diaChi + ", SĐT: " + sdt + ", Lớp: " + lop + ", Năng khiếu: " + nangKhieu;
    }
}
