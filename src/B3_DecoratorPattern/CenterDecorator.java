package B3_DecoratorPattern;

/**
 * Lớp CenterDecorator là một trang trí cụ thể trong ví dụ, nó trang trí một widget để canh giữa nó.
 */
public class CenterDecorator extends WidgetDecorator {
    public CenterDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void show() {
        System.out.println("CenterDecorator");
        widget.show();
    }
}
