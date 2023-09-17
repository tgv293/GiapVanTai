package BT5;

public class MainBT5 {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        QLDS qlds = new QLDS();

        HocSinh hs1 = new HocSinh("Nguyen Van A", 16, "Ha Noi", "123456789", "10A", "Toan");
        HocSinh hs2 = new HocSinh("Nguyen Thi B", 15, "Ho Chi Minh", "987654321", "11B", "Anh Van");

        GiaoVien gv1 = new GiaoVien("Le Van C", 35, "Da Nang", "555555555", "Toan", "Khoa Toan");
        GiaoVien gv2 = new GiaoVien("Tran Thi D", 40, "Hai Phong", "666666666", "Hoa", "Khoa Hoa");

        lopHoc.themHocSinh(hs1);
        lopHoc.themHocSinh(hs2);

        lopHoc.themGVGD(gv1);
        lopHoc.themGVGD(gv2);

        qlds.them(hs1);
        qlds.them(hs2);
        qlds.them(gv1);
        qlds.them(gv2);

        System.out.println("Danh sách học sinh:");
        lopHoc.inDSHS();

        System.out.println("\nDanh sách giáo viên giảng dạy:");
        lopHoc.inDSGVGD();

        System.out.println("\nDanh sách tất cả các cá nhân:");
        qlds.inDS();
    }
}
