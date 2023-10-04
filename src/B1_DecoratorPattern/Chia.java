package B1_DecoratorPattern;

class Chia extends BieuThucDecorator {
    private BieuThuc bt;

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
