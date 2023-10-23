package B3_DecoratorPattern;

/**
 * Lớp IconWidget triển khai giao diện Widget để hiển thị một widget biểu tượng cơ bản.
 */
public class IconWidget implements Widget {
    @Override
    public void show() {
        System.out.println("IconWidget");
    }
}
