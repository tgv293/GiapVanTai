package CB3_ChainOfResponsibility;

public class MainCB3 {
    public static void main(String[] args) {
        ITinhTienDien bac6 = new BacTienDien(400, 2927);
        ITinhTienDien bac5 = new BacTienDien(300, 2834);
        ITinhTienDien bac4 = new BacTienDien(200, 2536);
        ITinhTienDien bac3 = new BacTienDien(100, 2014);
        ITinhTienDien bac2 = new BacTienDien(50, 1734);
        ITinhTienDien bac1 = new BacTienDienSauCung(1678);


        bac6.bacTienDienTiepTheo(bac5)
                .bacTienDienTiepTheo(bac4)
                .bacTienDienTiepTheo(bac3)
                .bacTienDienTiepTheo(bac2)
                .bacTienDienTiepTheo(bac1);

        double soDienTieuThu = 500;
        double ketQua = bac6.tinhTien(soDienTieuThu);
        System.out.println("Số tiền phải trả cho " + soDienTieuThu + " kWh là: " + ketQua);
    }
}
