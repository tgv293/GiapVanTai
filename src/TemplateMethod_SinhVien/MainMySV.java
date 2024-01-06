package TemplateMethod_SinhVien;

import CD2_TemplateMethod.SinhVien;

public class MainMySV {
    public static void main(String[] args) {
        MySinhVienDB sinhVienDB = new MySinhVienDB();
        MySinhVien sv1 = new MySinhVien(1,"Văn Tài","22/09/2003","Nha Trang");
        MySinhVien sv2 = new MySinhVien(2,"Quốc Khánh","20/07/2003","Nha Trang");
        MySinhVien sv3 = new MySinhVien(3,"Lê Quân","25/06/2003","Nha Trang");
        MySinhVien sv4 = new MySinhVien(4,"Vĩnh Hoàng","05/06/2003","Nha Trang");
        sinhVienDB.add(sv1);
        sinhVienDB.add(sv2);
        sinhVienDB.add(sv3);
        sinhVienDB.add(sv4);
        System.out.println("Danh sách sinh viên:");
        for (MySinhVien sv : sinhVienDB.list) {
            System.out.println(sv.toString());
            System.out.println("---------------");
        }

        MySinhVien capNhatSV = new MySinhVien(4,"Đàm Hoàng","05/06/2003","Nghệ An");
        sinhVienDB.update(capNhatSV);
        System.out.println("Sau khi cập nhật:");
        for (MySinhVien sv : sinhVienDB.list) {
            System.out.println(sv.toString());
            System.out.println("---------------");
        }

        MySinhVien timSV1 = sinhVienDB.findByID(1);
        if(timSV1 != null) {
            System.out.println(timSV1.toString());
        }
        else System.out.println("Không tìm thấy sinh viên có mã số 1");

        sinhVienDB.deleteByID(2);
        System.out.println("Danh sách sinh viên sau khi xóa:");
        for (MySinhVien sv : sinhVienDB.list) {
            System.out.println(sv.toString());
            System.out.println("---------------");
        }

    }
}
