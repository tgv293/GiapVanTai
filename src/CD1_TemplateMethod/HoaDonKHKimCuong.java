package CD1_TemplateMethod;

public class HoaDonKHKimCuong extends HoaDon {
    @Override
    protected float tinhChietKhau(float tong) {
        if (tong >= 1500000) {
            return tong * 0.06f;
        } else if (tong >= 1000000) {
            return tong * 0.05f;
        } else if (tong >= 500000) {
            return tong * 0.03f;
        }
        return 0;
    }
}
