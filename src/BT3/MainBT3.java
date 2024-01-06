package BT3;

public class MainBT3 {
    public static void main(String[] args) {
        SinhVienIT svPoly = new SinhVienIT("Nguyen Van A", 8.5, 7.0, 9.0);
        SinhVienIT svIT = new SinhVienIT("Nguyen Van B", 8.5, 7.0, 9.0);
        SinhVienBiz svBiz = new SinhVienBiz("Nguyen Van C", 7.0, 8.5);

        svPoly.xuat();
        System.out.println("Điểm: " + svPoly.getDiem());
        System.out.println("Học lực: " + svPoly.getHocLuc());

        svIT.xuat();
        System.out.println("Điểm: " + svIT.getDiem());
        System.out.println("Học lực: " + svIT.getHocLuc());

        svBiz.xuat();
        System.out.println("Điểm: " + svBiz.getDiem());
        System.out.println("Học lực: " + svBiz.getHocLuc());
    }
}
