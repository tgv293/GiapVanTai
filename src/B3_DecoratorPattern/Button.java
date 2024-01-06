package B3_DecoratorPattern;

public class Button extends WidgetDecorator {


    public Button(Widget widget) {
        super(widget);
    }

    @Override
    public void show() {
        System.out.println("<button>");
        widget.show();
        System.out.println("</button>");
    }
}
