package B5_CompositePattern;

/**
 * Lớp Button là một thành phần cụ thể kế thừa từ Component, đại diện cho nút hoặc nút bấm.
 */
public class Button extends Component {
    String label;

    Button(String label) {
        this.label = label;
    }

    @Override
    void show() {
        System.out.println("Button: " + label);
    }
}
