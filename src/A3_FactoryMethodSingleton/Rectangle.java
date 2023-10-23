package A3_FactoryMethodSingleton;

/**
 * Lớp Rectangle là một lớp đại diện cho hình chữ nhật và là một ví dụ của mô hình Singleton.
 */
public class Rectangle extends Shape {
    private static Rectangle instance;

    /**
     * Constructor ẩn định để đảm bảo rằng không thể tạo các thể hiện của lớp Rectangle từ bên ngoài.
     */
    private Rectangle() {}

    /**
     * Phương thức này trả về một thể hiện của lớp Rectangle (nếu đã được tạo), hoặc tạo một thể hiện mới nếu chưa tồn tại.
     *
     * @return Thể hiện duy nhất của lớp Rectangle
     */
    public static synchronized Rectangle getInstance() {
        if (instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }

    /**
     * Phương thức này ghi đè phương thức của lớp cha để trả về thông điệp về việc vẽ hình chữ nhật.
     *
     * @return Chuỗi mô tả việc vẽ hình chữ nhật
     */
    @Override
    public String draw() {
        return "Drawing a rectangle";
    }
}
