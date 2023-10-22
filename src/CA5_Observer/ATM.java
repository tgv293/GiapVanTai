package CA5_Observer;

public class ATM implements TaiKhoan.ThongBao {
    TaiKhoan taiKhoan;

    public ATM(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        taiKhoan.attach(this);
    }

    public void kiemTraTienRut(int soTien) {
        if (kiemTraSoDu() >= soTien) {
            taiKhoan.rutTien(soTien);
        } else {
            nhanThongBao("Số dư không đủ để rút");
        }
    }

    @Override
    public void nhanThongBao(String thongBao) {
        System.out.println(thongBao);
    }

    @Override
    public int kiemTraSoDu() {
        return taiKhoan.kiemTraSoDu();
    }
}