package CA5_Observer;

public class TaiKhoan {
    private int soDu;
    private ThongBao observer;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }

    public void attach(ThongBao observer) {
        this.observer = observer;
    }

    public void detach() {
        this.observer = null;
    }

    public int kiemTraSoDu() {
        return soDu;
    }

    public void nhanThongBao(String thongBao) {
        System.out.println(thongBao);
    }

    public void rutTien(int soTien) {
        if (soTien <= soDu) {
            soDu -= soTien;
            if (observer != null) observer.nhanThongBao("Rút tiền thành công: " + soTien);
        } else {
            if (observer != null) observer.nhanThongBao("Số dư không đủ để rút");
        }
    }

    public static interface ThongBao {
        void nhanThongBao(String thongBao);
        int kiemTraSoDu();
    }
}