package CD1_TemplateMethod;

public class HoaDonKHThanThiet extends HoaDon {
    @Override
    protected float tinhChietKhau(float tong) {
        if (tong == 500000) {
            return tong * 0.02f;
        }
        return 0;
    }
}
