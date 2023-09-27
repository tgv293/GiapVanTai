package A3_FactoryMethodSingleton;

public class ShapeFactory {
    public enum ShapeType { RECTANGLE, TRIANGLE, CIRCLE }

    public static Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return Rectangle.getInstance();
            case TRIANGLE:
                return Triangle.getInstance();
            case CIRCLE:
                return Circle.getInstance();
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
