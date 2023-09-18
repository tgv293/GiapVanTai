package CC3_STRATERYPATTERN;

public class Airpay implements IThanhToan{
    @Override
    public float thanhToan(float tienHang) {
        if (tienHang >= 1000000) {
            return tienHang * 0.97f;
        } else {
            return tienHang;
        }
    }
}
