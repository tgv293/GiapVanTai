package B3_DecoratorPattern;

public abstract class WidgetDecorator extends Widget {
    Widget widget;

    public WidgetDecorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public abstract void show();
}
