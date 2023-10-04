package B1_DecoratorPattern;

class BieuThucDonGian extends BieuThuc {
    private float toanHang;

    BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return toanHang;
    }

    @Override
    String bieuThuc() {
        return String.valueOf(toanHang);
    }
}