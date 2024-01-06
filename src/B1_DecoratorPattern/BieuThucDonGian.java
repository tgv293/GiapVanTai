package B1_DecoratorPattern;

class BieuThucDonGian extends BieuThuc {
    private float toanHang;

    /**
     * Constructor khởi tạo lớp BieuThucDonGian với một toán hạng đầu vào.
     *
     * @param toanHang Toán hạng
     */
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
