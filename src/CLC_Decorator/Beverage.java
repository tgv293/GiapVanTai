package CLC_Decorator;

public abstract class Beverage {
    String description;
    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
