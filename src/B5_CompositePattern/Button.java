package B5_CompositePattern;

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
