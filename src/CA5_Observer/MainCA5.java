package CA5_Observer;

public class MainCA5 {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan(10000);
        ATM atm = new ATM(taiKhoan);

        atm.kiemTraTienRut(5000);
        atm.kiemTraTienRut(7000);

    }
}
