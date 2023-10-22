package CD2_TemplateMethod;

public class MainCD2 {
    public static void main(String[] args) {
        EntityDB<SinhVien> qlSV = new SinhVienDB();
        qlSV.add(new SinhVien(1,"Văn Tài","22/09/2003","Nha Trang"));
        qlSV.add(new SinhVien(2,"Quốc Khánh","20/07/2003","Nha Trang"));
        qlSV.add(new SinhVien(3,"Lê Quân","25/06/2003","Nha Trang"));
        qlSV.add(new SinhVien(4,"Vĩnh Hoàng","05/06/2003","Nha Trang"));
        System.out.println("In thông tin lần 1:\n");
        qlSV.printInfo();
        System.out.println("Cập nhật thông tin:\n");
        qlSV.update(new SinhVien(4,"Đàm Hoàng","05/06/2003","Nghệ An"));
        System.out.println("Xóa thông tin:\n");
        qlSV.deleteById(2);
        System.out.println("In thông tin lần 2:\n");
        qlSV.printInfo();
    }
}
