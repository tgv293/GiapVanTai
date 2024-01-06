package A3_FactoryMethodSingleton;

public class ShapeFactory {
    /**
     * Phương thức tạo hình với loại cụ thể được chỉ định.
     *
     * @param shapeType Loại hình muốn tạo
     * @return Thể hiện của lớp con cụ thể được tạo ra
     * @throws IllegalArgumentException nếu loại hình không hợp lệ
     */
    public static Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE -> {
                return new Circle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
            case RECTANGLE -> {
                return new Rectangle();
            }
        }
        return null;
    }
}
