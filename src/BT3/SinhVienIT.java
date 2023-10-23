package BT3;

// Lớp SinhVienIT kế thừa từ SinhVienPoly, đại diện cho sinh viên ngành IT
class SinhVienIT extends SinhVienPoly {
    double diemJava;
    double diemCss;
    double diemHtml;

    SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}
