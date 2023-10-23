package B1_DecoratorPattern;

/**
 * Lớp Cong là một decorator để thực hiện phép cộng giữa hai biểu thức.
 */
class Cong extends BieuThucDecorator {
    private BieuThuc bt;

    /**
     * Constructor khởi tạo lớp Cong với hai biểu thức đầu vào.
     *
     * @param bt1 Biểu thức thứ nhất
     * @param bt2 Biểu thức thứ hai
     */
    Cong(BieuThuc bt1, BieuThuc bt2) {
        super(bt1);
        this.bt = bt2;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri() + bt.giaTri();
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc() + " + " + bt.bieuThuc();
    }
}
