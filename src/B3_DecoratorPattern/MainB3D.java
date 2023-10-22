package B3_DecoratorPattern;

public class MainB3D {
    public static void main(String[] args) {
        Widget widget = new TextWidget();
        widget = new CenterDecorator(widget);
        widget.show();
    }
}
