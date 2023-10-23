package B5_CompositePattern;

/**
 * Lớp Text là một thành phần cụ thể kế thừa từ Component, đại diện cho văn bản hoặc nội dung văn bản.
 */
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
