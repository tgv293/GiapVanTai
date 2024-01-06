package B1_DecoratorPattern;

class Nhan extends BieuThucDecorator {
    private BieuThuc bt;

    /**
     * Constructor khởi tạo lớp Nhan với hai biểu thức đầu vào.
     *
     * @param bt1 Biểu thức thứ nhất
     * @param bt2 Biểu thức thứ hai
     */
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
