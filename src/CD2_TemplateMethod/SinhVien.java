package CD2_TemplateMethod;

public class SinhVien {
    int id;
    String tenSV, ngaySinh, queQuan;

    public SinhVien(int id, String tenSV, String ngaySinh, String queQuan) {
        this.id = id;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "\ntenSV: " + tenSV +
                "\nngaySinh: " + ngaySinh +
                "\nqueQuan: " + queQuan;
    }
}
