package A3_FactoryMethodSingleton;

public class Circle extends Shape {
    private static Circle instance;

    private Circle() {}

    public static synchronized Circle getInstance() {
        if (instance == null) {
            instance = new Circle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Drawing a circle";
    }
}
