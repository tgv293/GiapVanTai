package B5_CompositePattern;

public class MainB5 {
    public static void main(String[] args) {
        // Tạo các thành phần cụ thể
        Text text = new Text("Hello, world!");
        Button button = new Button("Click me!");

        // Tạo layout và thêm các thành phần vào layout
        Layout layout = new Layout("My Layout");
        layout.add(text);
        layout.add(button);

        // Hiển thị nội dung của layout
        layout.show();
    }
}
