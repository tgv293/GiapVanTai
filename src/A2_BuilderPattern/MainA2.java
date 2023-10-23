package A2_BuilderPattern;

/**
 * Lớp MainA2 là lớp chứa phương thức main, chịu trách nhiệm thực thi ứng dụng và tạo chuỗi tùy chỉnh sử dụng lớp MyStringBuilder.
 */
public class MainA2 {
    public static void main(String[] args) {
        // Tạo một đối tượng MyStringBuilder để xây dựng chuỗi tùy chỉnh.
        MyStringBuilder myStrBuilder = new MyStringBuilder();

        // Sử dụng phương thức addString, addFloat và addBool để gắn kết các giá trị vào chuỗi.
        myStrBuilder.addString("Hello, ").addString("World!").addFloat(1.23f).addBool(true);

        // In chuỗi tùy chỉnh ra màn hình.
        System.out.println(myStrBuilder);
    }
}
