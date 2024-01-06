package CB3_ChainOfResponsibility;

public class MainCB3 {
    public static void main(String[] args) {
        ITinhTienDien bac1 = new BacTienDien(0, 50,1806);
        ITinhTienDien bac2 = new BacTienDien(50, 100,1866);
        ITinhTienDien bac3 = new BacTienDien(100,200, 2167);
        ITinhTienDien bac4 = new BacTienDien(200,300, 2729);
        ITinhTienDien bac5 = new BacTienDien(300,400, 3050);
        ITinhTienDien bac6 = new BacTienDien(400,Double.MAX_VALUE,3151);


        bac1.bacTienDienTiepTheo(bac2)
                .bacTienDienTiepTheo(bac3)
                .bacTienDienTiepTheo(bac4)
                .bacTienDienTiepTheo(bac5)
                .bacTienDienTiepTheo(bac6);

        double soDienTieuThu = 175;
        double ketQua = bac1.tinhTien(soDienTieuThu);
        System.out.println("Số tiền phải trả cho " + soDienTieuThu + " kWh là: " + ketQua);
    }
}
