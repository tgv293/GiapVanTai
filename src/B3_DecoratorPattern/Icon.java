package B3_DecoratorPattern;

public class Icon extends Widget {
    String content;

    public Icon(String content) {
        this.content = content;
    }


    @Override
    public void show() {
        System.out.println(content);
    }
}
