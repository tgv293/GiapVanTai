package B3_DecoratorPattern;

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
