package B3_DecoratorPattern;

public class MainB3D {
    public static void main(String[] args) {
        Widget text = new Text("Trời sẽ mưa");
        Widget center = new Center(text);
        center.show();

        Widget icon = new Icon("triangle");
        Widget center2 = new Center(icon);
        Widget button = new Button(center2);
        button.show();
    }
}
