package CB3_ChainOfResponsibility;

/**
 * Lớp BacTienDienSauCung đại diện cho bậc tính tiền điện cuối cùng với giá tiền cụ thể, và là một phần của mô hình Chain of Responsibility.
 */
public class BacTienDienSauCung implements ITinhTienDien {
    private double giaTien;

    public BacTienDienSauCung(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public ITinhTienDien bacTienDienTiepTheo(ITinhTienDien bacTiepTheo) {
        return null;
    }

    @Override
    public double tinhTien(double soDienTieuThu) {
        return soDienTieuThu * giaTien;
    }
}
