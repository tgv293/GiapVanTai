package B1_DecoratorPattern;

abstract class BieuThucDecorator extends BieuThuc {
    protected BieuThuc bieuThuc;

    /**
     * Constructor khởi tạo lớp BieuThucDecorator với một biểu thức gốc.
     *
     * @param bieuThuc Biểu thức gốc mà decorator sẽ thay đổi hoặc mở rộng
     */
    BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
}
