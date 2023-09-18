package CC3_STRATERYPATTERN;

public class COD implements IThanhToan{
    @Override
    public float thanhToan(float tienHang) {
        if (tienHang >= 2000000) {
            return tienHang * 0.98f;
        } else {
            return tienHang;
        }
    }
}
