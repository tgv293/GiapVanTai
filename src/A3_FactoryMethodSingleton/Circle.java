package A3_FactoryMethodSingleton;

/**
 * Lớp Circle là một lớp đại diện cho hình tròn và là một ví dụ của mô hình Singleton.
 */
public class Circle extends Shape {
    private static Circle instance;

    /**
     * Constructor ẩn định để đảm bảo rằng không thể tạo các thể hiện của lớp Circle từ bên ngoài.
     */
    private Circle() {}

    /**
     * Phương thức này trả về một thể hiện của lớp Circle (nếu đã được tạo), hoặc tạo một thể hiện mới nếu chưa tồn tại.
     *
     * @return Thể hiện duy nhất của lớp Circle
     */
    public static synchronized Circle getInstance() {
        if (instance == null) {
            instance = new Circle();
        }
        return instance;
    }

    /**
     * Phương thức này ghi đè phương thức của lớp cha để trả về thông điệp về việc vẽ hình tròn.
     *
     * @return Chuỗi mô tả việc vẽ hình tròn
     */
    @Override
    public String draw() {
        return "Drawing a circle";
    }
}
