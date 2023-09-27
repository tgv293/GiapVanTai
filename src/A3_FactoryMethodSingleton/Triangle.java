package A3_FactoryMethodSingleton;

public class Triangle extends Shape {
    private static Triangle instance;

    private Triangle() {}

    public static synchronized Triangle getInstance() {
        if (instance == null) {
            instance = new Triangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Drawing a triangle";
    }
}
