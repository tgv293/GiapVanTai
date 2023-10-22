package CB3_ChainOfResponsibility;

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