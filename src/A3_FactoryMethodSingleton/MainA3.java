package A3_FactoryMethodSingleton;

public class MainA3 {
    public static void main(String[] args) {
        // Sử dụng lớp ShapeFactory để tạo các hình và gọi phương thức draw() để vẽ chúng.
        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        System.out.println(rectangle.draw());

        Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE);
        System.out.println(triangle.draw());

        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        System.out.println(circle.draw());
    }
}
