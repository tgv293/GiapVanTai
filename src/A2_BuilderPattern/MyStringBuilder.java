package A2_BuilderPattern;

/**
 * Lớp MyStringBuilder là một lớp tùy chỉnh dùng để xây dựng chuỗi dựa trên mô hình Builder.
 */
public class MyStringBuilder {
    private StringBuilder str;

    /**
     * Constructor khởi tạo một đối tượng MyStringBuilder với một chuỗi rỗng.
     */
    public MyStringBuilder() {
        this.str = new StringBuilder();
    }

    /**
     * Phương thức này thêm một chuỗi vào đối tượng MyStringBuilder và trả về chính đối tượng MyStringBuilder để hỗ trợ việc gắn kết chuỗi.
     *
     * @param s Chuỗi cần thêm
     * @return Đối tượng MyStringBuilder đã được cập nhật
     */
    public MyStringBuilder addString(String s) {
        this.str.append(s);
        return this;
    }

    /**
     * Phương thức này thêm một số kiểu float vào đối tượng MyStringBuilder và trả về chính đối tượng MyStringBuilder để hỗ trợ việc gắn kết chuỗi.
     *
     * @param f Số kiểu float cần thêm
     * @return Đối tượng MyStringBuilder đã được cập nhật
     */
    public MyStringBuilder addFloat(float f) {
        this.str.append(f);
        return this;
    }

    /**
     * Phương thức này thêm một giá trị kiểu boolean vào đối tượng MyStringBuilder và trả về chính đối tượng MyStringBuilder để hỗ trợ việc gắn kết chuỗi.
     *
     * @param b Giá trị kiểu boolean cần thêm
     * @return Đối tượng MyStringBuilder đã được cập nhật
     */
    public MyStringBuilder addBool(boolean b) {
        this.str.append(b);
        return this;
    }

    /**
     * Phương thức này trả về chuỗi biểu diễn của đối tượng MyStringBuilder.
     *
     * @return Chuỗi biểu diễn của đối tượng MyStringBuilder
     */
    @Override
    public String toString() {
        return this.str.toString();
    }
}
