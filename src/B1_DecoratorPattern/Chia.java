package B1_DecoratorPattern;

class Chia extends BieuThucDecorator {
    private BieuThuc bt;

    /**
     * Constructor khởi tạo lớp Chia với hai biểu thức đầu vào.
     *
     * @param bt1 Biểu thức thứ nhất
     * @param bt2 Biểu thức thứ hai
     */
    Chia(BieuThuc bt1, BieuThuc bt2) {
        super(bt1);
        this.bt = bt2;
    }

    @Override
    float giaTri() {
        if (bt.giaTri() != 0) {
            return bieuThuc.giaTri() / bt.giaTri();
        } else {
            throw new UnsupportedOperationException("Không thể chia cho 0");
        }
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc() + " / " + bt.bieuThuc();
    }
}
