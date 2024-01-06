package CC3_STRATERYPATTERN;

public class KhuyenMai10Max100 implements IKhuyenMai {

    @Override
    public float khuyenMai(float tienHang) {
        float tienKM = tienHang * 0.1f;
        return tienKM < 100 ? tienKM : 100;
    }
}
