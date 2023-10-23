package BT3;

// Lớp trừu tượng SinhVienPoly đại diện cho sinh viên
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng để lấy điểm của sinh viên
    abstract double getDiem();

    // Phương thức để lấy học lực của sinh viên dựa trên điểm
    String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) return "Yếu";
        if (diem < 6.5) return "Trung bình";
        if (diem < 7.5) return "Khá";
        if (diem < 9) return "Giỏi";
        return "Xuất sắc";
    }

    // Phương thức để xuất thông tin sinh viên
    void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
    }
}
