package A6;

public class MainA6 {
    public static void main(String[] args) {
        DataAccessUpgrade d1 = DataAccessUpgrade.getInstance("type1");
        d1.them(new SanPham("SP1", "Sản phẩm 1", 10, 100.0));
        d1.them(new SanPham("SP2", "Sản phẩm 2", 5, 50.0));
        d1.hienThiDSSanPham();

        DataAccessUpgrade d2 = DataAccessUpgrade.getInstance("type2");
        d2.them(new SanPham("SP3", "Sản phẩm 3", 15, 150.0));
        d2.them(new SanPham("SP4", "Sản phẩm 4", 20, 200.0));
        System.out.println("D2:");
        d2.hienThiDSSanPham();
    }
}
