package A3_FactoryMethodSingleton;

public class Triangle extends Shape {
    public static Triangle instance;

    /**
     * Constructor ẩn định để đảm bảo rằng không thể tạo các thể hiện của lớp Triangle từ bên ngoài.
     */
    public Triangle() {}

    /**
     * Phương thức này trả về một thể hiện của lớp Triangle (nếu đã được tạo), hoặc tạo một thể hiện mới nếu chưa tồn tại.
     *
     * @return Thể hiện duy nhất của lớp Triangle
     */
    public static synchronized Triangle getInstance() {
        if (instance == null) {
            instance = new Triangle();
        }
        return instance;
    }

    /**
     * Phương thức này ghi đè phương thức của lớp cha để trả về thông điệp về việc vẽ hình tam giác.
     *
     * @return Chuỗi mô tả việc vẽ hình tam giác
     */
    @Override
    public String draw() {
        return "Drawing a triangle";
    }
}
