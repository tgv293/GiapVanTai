package CB3_ChainOfResponsibility;

/**
 * Lớp BacTienDien đại diện cho một bậc tính tiền điện với giới hạn và giá tiền cụ thể, và là một phần của mô hình Chain of Responsibility.
 */
public class BacTienDien implements ITinhTienDien {
    double gioiHan;
    double giaTien;
    ITinhTienDien bacTienDienTiepTheo;

    public BacTienDien(double gioiHan, double giaTien) {
        this.gioiHan = gioiHan;
        this.giaTien = giaTien;
    }

    @Override
    public ITinhTienDien bacTienDienTiepTheo(ITinhTienDien bacTiepTheo) {
        this.bacTienDienTiepTheo = bacTiepTheo;
        return bacTiepTheo;
    }

    @Override
    public double tinhTien(double soDienTieuThu) {
        if (soDienTieuThu <= gioiHan) {
            return bacTienDienTiepTheo.tinhTien(soDienTieuThu);
        }

        double soDienTieuThuTrongBac = soDienTieuThu - gioiHan;
        double soDienTieuThuChuaTinh = gioiHan;

        return giaTien * soDienTieuThuTrongBac + bacTienDienTiepTheo.tinhTien(soDienTieuThuChuaTinh);
    }
}
