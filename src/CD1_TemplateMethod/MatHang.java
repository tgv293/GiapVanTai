package CD1_TemplateMethod;

public class MatHang {
    private String ten;
    private int soLuong;
    private double donGia;

    public MatHang(String ten, int soLuong, double donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public double thanhTien() {
        return soLuong * donGia;
    }
}
