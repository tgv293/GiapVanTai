package BT2;

import BT1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLyNV = new QuanLyNhanVien();
        quanLyNV.themNV(new NhanVien("Minh", "Nha Trang", 100, 30, 13000000));
        quanLyNV.themNV(new NhanVien("Mẫn", "Nha Trang", 100, 30, 13000000));
        quanLyNV.themNV(new NhanVien("Mẽo", "Nha Trang", 100, 30, 13000000));
        quanLyNV.themNV(new NhanVien("Phúc", "Nha Trang", 100, 30, 13000000));
        quanLyNV.themNV(new NhanVien("Thư", "Nha Trang", 100, 30, 13000000));
        quanLyNV.inDS();
    }
}
