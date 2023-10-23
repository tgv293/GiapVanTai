package B3_DecoratorPattern;

/**
 * Lớp trừu tượng WidgetDecorator là một phần của mô hình Decorator, mà tất cả các trang trí khác cần phải triển khai.
 */
public abstract class WidgetDecorator implements Widget {
    protected Widget widget;

    public WidgetDecorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public abstract void show();
}
