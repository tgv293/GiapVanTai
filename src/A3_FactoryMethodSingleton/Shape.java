package A3_FactoryMethodSingleton;

/**
 * Lớp Shape là một lớp trừu tượng đại diện cho các hình vẽ và định nghĩa các thuộc tính cơ bản của hình.
 */
public abstract class Shape {
    protected String brush; // Thuộc tính đại diện cho loại bút vẽ
    protected String paper; // Thuộc tính đại diện cho loại giấy vẽ
    protected String frame; // Thuộc tính đại diện cho khung viền hình

    /**
     * Phương thức trừu tượng để định nghĩa việc vẽ hình, được ghi đè bởi các lớp con cụ thể.
     *
     * @return Chuỗi mô tả việc vẽ hình
     */
    public abstract String draw();
}
