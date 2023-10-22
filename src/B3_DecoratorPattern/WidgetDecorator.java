package B3_DecoratorPattern;

public abstract class WidgetDecorator implements Widget {
    protected Widget widget;

    public WidgetDecorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public abstract void show();
}
