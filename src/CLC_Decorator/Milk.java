package CLC_Decorator;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Sữa ông thọ";
    }
}
