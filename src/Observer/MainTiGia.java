package Observer;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia63 tiGia63 = new TiGia63();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia63);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia63);
        System.out.println("Lần 1");
        tiGia63.thongBaoThayDoi(-10);
        nhaDauTuA.huyDangKy();
        System.out.println("Lần 2");
        tiGia63.thongBaoThayDoi(10);
    }
}
