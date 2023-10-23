package BT4;

/**
 * Lớp MainBT4 là lớp chứa hàm main để thực hiện thử nghiệm chương trình quản lý chuyến xe.
 */
public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe chuyenXe = new QuanLyChuyenXe();
        ChuyenXeNoiThanh cxnt1 = new ChuyenXeNoiThanh("79-CX", "1", "4950", 60000, "27", "3400km");
        ChuyenXeNoiThanh cxnt2 = new ChuyenXeNoiThanh("79-CX", "2", "6958", 60000, "27", "3400km");
        ChuyenXeNoiThanh cxnt3 = new ChuyenXeNoiThanh("79-CX", "3", "3423", 60000, "27", "3400km");
        ChuyenXeNgoaiThanh cxngt1 = new ChuyenXeNgoaiThanh("79-CX", "4", "4950", 60000, "Ha Noi", 30);
        ChuyenXeNgoaiThanh cxngt2 = new ChuyenXeNgoaiThanh("79-CX", "5", "4953", 70000, "Nha Trang", 40);
        ChuyenXeNgoaiThanh cxngt3 = new ChuyenXeNgoaiThanh("79-CX", "6", "3234", 80000, "Thanh Hoa", 50);

        chuyenXe.them(cxnt1);
        chuyenXe.them(cxnt2);
        chuyenXe.them(cxnt3);

        chuyenXe.them(cxngt1);
        chuyenXe.them(cxngt2);
        chuyenXe.them(cxngt3);

        chuyenXe.inDS();

        System.out.println("Tổng doanh thu xe nội thành: " + chuyenXe.doanhThuXeNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: " + chuyenXe.doanhThuXeNgoaiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: " + chuyenXe.tongDoanhThu());
    }
}
