package ChainOfResponsibility.F88;

public class MainF88 {
    public static void main(String[] args) {
        IXuLyKhoanVay gacCong = new NhanVienF88("Tuyền","Gác cổng",100000);
        IXuLyKhoanVay giuxe = new NhanVienF88("Thắng","Giữ xe",200000);
        IXuLyKhoanVay thuky = new NhanVienF88("Tài","Thư ký",300000);
        IXuLyKhoanVay truongphong = new NhanVienF88("Linh","Trường phòng",400000);
        IXuLyKhoanVay giamdoc = new GiamDocF88("Định",500000);

        gacCong.capCaoHon(giuxe)
                .capCaoHon(thuky)
                .capCaoHon(truongphong)
                .capCaoHon(giamdoc);

        System.out.println(gacCong.xuLyVay(250000));
    }
}
