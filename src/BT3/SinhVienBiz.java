package BT3;

// Lớp SinhVienBiz kế thừa từ SinhVienPoly, đại diện cho sinh viên ngành Biz
class SinhVienBiz extends SinhVienPoly {
    double diemMarketing;
    double diemSales;

    SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
