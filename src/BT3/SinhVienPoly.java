package BT3;

// Lớp trừu tượng SinhVienPoly
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    abstract double getDiem();

    String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) return "Yếu";
        if (diem < 6.5) return "Trung bình";
        if (diem < 7.5) return "Khá";
        if (diem < 9) return "Giỏi";
        return "Xuất sắc";
    }

    void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
    }
}






