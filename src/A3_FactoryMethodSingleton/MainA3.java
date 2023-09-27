package A3_FactoryMethodSingleton;

public class MainA3 {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape(ShapeFactory.ShapeType.RECTANGLE);
        System.out.println(rectangle.draw());

        Shape triangle = ShapeFactory.createShape(ShapeFactory.ShapeType.TRIANGLE);
        System.out.println(triangle.draw());

        Shape circle = ShapeFactory.createShape(ShapeFactory.ShapeType.CIRCLE);
        System.out.println(circle.draw());
    }
}
