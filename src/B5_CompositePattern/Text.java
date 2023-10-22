package B5_CompositePattern;

public class Text extends Component {
    String content;

    Text(String content) {
        this.content = content;
    }

    @Override
    void show() {
        System.out.println("Text: " + content);
    }
}
