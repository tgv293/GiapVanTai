package A3_FactoryMethodSingleton;

public class Rectangle extends Shape {
    private static Rectangle instance;

    private Rectangle() {}

    public static synchronized Rectangle getInstance() {
        if (instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Drawing a rectangle";
    }
}
