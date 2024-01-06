package B3_DecoratorPattern;

public class Text extends Widget {
    String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
