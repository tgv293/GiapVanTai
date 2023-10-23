package A3_FactoryMethodSingleton;

/**
 * Lớp ShapeFactory là một factory class (lớp tạo) để tạo các hình vẽ khác nhau sử dụng mô hình Factory Method.
 */
public class ShapeFactory {
    // Liệt kê các loại hình mà factory này có thể tạo.
    public enum ShapeType { RECTANGLE, TRIANGLE, CIRCLE }

    /**
     * Phương thức tạo hình với loại cụ thể được chỉ định.
     *
     * @param shapeType Loại hình muốn tạo
     * @return Thể hiện của lớp con cụ thể được tạo ra
     * @throws IllegalArgumentException nếu loại hình không hợp lệ
     */
    public static Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case RECTANGLE -> Rectangle.getInstance();
            case TRIANGLE -> Triangle.getInstance();
            case CIRCLE -> Circle.getInstance();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}
