package CA5_Observer;

/**
 * Lớp ATM đại diện cho máy rút tiền và là một người theo dõi (Observer) của tài khoản ngân hàng, implement giao diện ThongBao.
 */
public class ATM implements TaiKhoan.ThongBao {
    TaiKhoan taiKhoan;

    /**
     * Constructor khởi tạo một đối tượng ATM và đăng ký nó làm người theo dõi (Observer) cho tài khoản ngân hàng.
     *
     * @param taiKhoan Tài khoản ngân hàng cần theo dõi.
     */
    public ATM(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        taiKhoan.attach(this);
    }

    /**
     * Phương thức này kiểm tra số dư trong tài khoản trước khi thực hiện việc rút tiền. Nếu số dư đủ, nó gọi phương thức rutTien() của tài khoản.
     *
     * @param soTien Số tiền cần rút.
     */
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
