package CB3_ChainOfResponsibility;

public class BacTienDien implements ITinhTienDien {
    double min,max,giaTien;

    ITinhTienDien bacTienDienTiepTheo;

    public BacTienDien(double min, double max, double giaTien) {
        this.min = min;
        this.max = max;
        this.giaTien = giaTien;
    }

    @Override
    public ITinhTienDien bacTienDienTiepTheo(ITinhTienDien bacTiepTheo) {
        this.bacTienDienTiepTheo = bacTiepTheo;
        return bacTiepTheo;
    }

    @Override
    public double tinhTien(double soDienTieuThu) {
        if (soDienTieuThu <= max) {
            return (soDienTieuThu - min) * giaTien;
        }

        return (max-min)*giaTien+bacTienDienTiepTheo.tinhTien(soDienTieuThu);
    }
}
