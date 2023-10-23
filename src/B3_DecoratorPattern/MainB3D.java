package B3_DecoratorPattern;

/**
 * Lớp MainB3D thực hiện ví dụ về mô hình Decorator để trang trí TextWidget với CenterDecorator.
 */
public class MainB3D {
    public static void main(String[] args) {
        Widget widget = new TextWidget();
        widget = new CenterDecorator(widget);
        widget.show();
    }
}
