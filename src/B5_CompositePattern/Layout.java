package B5_CompositePattern;

/**
 * Lớp Layout là một thành phần tổng hợp kế thừa từ Component, đại diện cho layout chứa nhiều thành phần con.
 */

import java.util.*;

public class Layout extends Component {
    String name;
    List<Component> components = new ArrayList<>();

    Layout(String name) {
        this.name = name;
    }

    void add(Component component) {
        components.add(component);
    }

    @Override
    void show() {
        System.out.println("Layout: " + name);
        for (Component component : components) {
            component.show();
        }
    }
}
