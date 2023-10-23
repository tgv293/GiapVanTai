package B3_DecoratorPattern;

/**
 * Lớp ButtonWidget triển khai giao diện Widget để hiển thị một widget nút bấm cơ bản.
 */
public class ButtonWidget implements Widget {
    @Override
    public void show() {
        System.out.println("ButtonWidget");
    }
}
