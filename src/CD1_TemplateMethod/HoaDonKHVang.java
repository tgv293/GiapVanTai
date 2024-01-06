package CD1_TemplateMethod;

public class HoaDonKHVang extends HoaDon {
    @Override
    protected float tinhChietKhau(float tong) {
        if (tong >= 500000 && tong < 1000000) {
            return tong * 0.03f;
        } else if (tong >= 1000000) {
            return tong * 0.05f;
        }
        return 0;
    }
}
