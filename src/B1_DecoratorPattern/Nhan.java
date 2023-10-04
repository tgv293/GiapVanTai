package B1_DecoratorPattern;

class Nhan extends BieuThucDecorator {
    private BieuThuc bt;

    Nhan(BieuThuc bt1, BieuThuc bt2) {
        super(bt1);
        this.bt = bt2;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri() * bt.giaTri();
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc() + " * " + bt.bieuThuc();
    }
}

