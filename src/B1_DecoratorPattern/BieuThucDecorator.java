package B1_DecoratorPattern;

/**
 * Lớp BieuThucDecorator là một lớp trừu tượng dùng làm cơ sở cho tất cả các decorator khác.
 * Một decorator sẽ kế thừa từ lớp này và mở rộng hoặc thay đổi hành vi của biểu thức gốc (bieuThuc).
 */
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
