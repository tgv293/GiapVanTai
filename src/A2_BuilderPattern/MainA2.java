package A2_BuilderPattern;

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
