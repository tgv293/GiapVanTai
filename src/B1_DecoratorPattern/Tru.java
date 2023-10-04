package B1_DecoratorPattern;

class Tru extends BieuThucDecorator {
    private BieuThuc bt;

    Tru(BieuThuc bt1, BieuThuc bt2) {
        super(bt1);
        this.bt = bt2;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri() - bt.giaTri();
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc() + " - " + bt.bieuThuc();
    }
}
