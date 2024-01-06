package B3_DecoratorPattern;

public class Center extends WidgetDecorator{

    public Center(Widget widget) {
        super(widget);
    }

    @Override
    public void show() {
        System.out.println("<center>");
        widget.show();
        System.out.println("</center>");
    }
}
