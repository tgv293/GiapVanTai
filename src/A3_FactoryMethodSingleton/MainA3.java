package A3_FactoryMethodSingleton;

/**
 * Lớp MainA3 là lớp chứa phương thức main, chịu trách nhiệm thực thi ứng dụng và sử dụng mô hình Factory Method để tạo các hình khác nhau.
 */
public class MainA3 {
    public static void main(String[] args) {
        // Sử dụng lớp ShapeFactory để tạo các hình và gọi phương thức draw() để vẽ chúng.
        Shape rectangle = ShapeFactory.createShape(ShapeFactory.ShapeType.RECTANGLE);
        System.out.println(rectangle.draw());

        Shape triangle = ShapeFactory.createShape(ShapeFactory.ShapeType.TRIANGLE);
        System.out.println(triangle.draw());

        Shape circle = ShapeFactory.createShape(ShapeFactory.ShapeType.CIRCLE);
        System.out.println(circle.draw());
    }
}
