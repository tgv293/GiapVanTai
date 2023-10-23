package BT1;

/**
 * Lớp MainBT1 thực hiện ví dụ về việc tạo và sử dụng đối tượng NhanVien
 * để hiển thị thông tin về một nhân viên và tính toán tiền thưởng.
 */
public class MainBT1 {
    public static void main(String[] args) {
        // Tạo hai đối tượng nhân viên
        NhanVien nv1 = new NhanVien("Minh", "Nha Trang", 100, 30, 13000000);
        NhanVien nv2 = new NhanVien("Mẫn", "Nha Trang", 100, 30, 13000000);

        // Hiển thị thông tin của nhân viên nv1
        System.out.println(nv1.getThongTin());

        // Hiển thị thông tin của nhân viên nv2
        System.out.println(nv2.getThongTin());
    }
}
