package B5_CompositePattern;

/**
 * Lớp MainB5 thực hiện ví dụ về mô hình Composite để tạo layout chứa các thành phần văn bản và nút.
 */
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
