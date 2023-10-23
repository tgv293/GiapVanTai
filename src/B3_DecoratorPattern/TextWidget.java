package B3_DecoratorPattern;

/**
 * Lớp TextWidget triển khai giao diện Widget để hiển thị một widget văn bản cơ bản.
 */
public class TextWidget implements Widget {
    @Override
    public void show() {
        System.out.println("TextWidget");
    }
}
