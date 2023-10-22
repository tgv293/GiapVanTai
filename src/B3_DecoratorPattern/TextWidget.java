package B3_DecoratorPattern;

public class TextWidget implements Widget {
    @Override
    public void show() {
        System.out.println("TextWidget");
    }
}