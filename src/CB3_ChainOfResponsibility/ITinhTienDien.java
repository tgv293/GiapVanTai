package CB3_ChainOfResponsibility;

public interface ITinhTienDien {
    ITinhTienDien bacTienDienTiepTheo(ITinhTienDien bacTiepTheo);

    double tinhTien(double soDienTieuThu);
}
