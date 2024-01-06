package CA5_Observer;

public class TaiKhoan {
    private int soDu;
    private ThongBao observer;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }

    /**
     * Phương thức này cho phép đính kèm một đối tượng ThongBao làm người theo dõi (Observer) cho tài khoản.
     *
     * @param observer Đối tượng ThongBao (Observer) để đính kèm.
     */
    public void attach(ThongBao observer) {
        this.observer = observer;
    }

    /**
     * Phương thức này cho phép loại bỏ đối tượng ThongBao làm người theo dõi (Observer) khỏi tài khoản.
     */
    public void detach() {
        this.observer = null;
    }

    /**
     * Phương thức này kiểm tra số dư hiện tại trong tài khoản.
     *
     * @return Số dư hiện tại trong tài khoản.
     */
    public int kiemTraSoDu() {
        return soDu;
    }

    /**
     * Phương thức này thông báo một thông điệp đến người theo dõi (Observer) của tài khoản.
     *
     * @param thongBao Thông điệp cần thông báo.
     */
    public void nhanThongBao(String thongBao) {
        System.out.println(thongBao);
    }

    /**
     * Phương thức này thực hiện rút tiền từ tài khoản và thông báo cho người theo dõi (Observer) nếu có.
     *
     * @param soTien Số tiền cần rút.
     */
    public void rutTien(int soTien) {
        if (soTien <= soDu) {
            soDu -= soTien;
            if (observer != null) observer.nhanThongBao("Rút tiền thành công: " + soTien);
        } else {
            if (observer != null) observer.nhanThongBao("Số dư không đủ để rút");
        }
    }

    /**
     * Giao diện ThongBao đại diện cho người theo dõi (Observer) của tài khoản và định nghĩa các phương thức liên quan.
     */
    public static interface ThongBao {
        /**
         * Phương thức này nhận thông báo từ tài khoản.
         *
         * @param thongBao Thông điệp từ tài khoản.
         */
        void nhanThongBao(String thongBao);

        /**
         * Phương thức này kiểm tra số dư hiện tại trong tài khoản.
         *
         * @return Số dư hiện tại trong tài khoản.
         */
        int kiemTraSoDu();
    }
}
