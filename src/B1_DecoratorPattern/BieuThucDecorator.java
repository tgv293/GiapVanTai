package B1_DecoratorPattern;

abstract class BieuThucDecorator extends BieuThuc {
    protected BieuThuc bieuThuc;

    BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
}
