package CLC_Decorator;

public class MainCLCDecorator {
    public static void main(String[] args) {
        Beverage coffee = new HouseBlend("Cafe House Blend Trung Nguyên");
        coffee = new Milk(coffee);
        coffee = new Milk(coffee);
        coffee = new Mocha(coffee);
        System.out.println(coffee.getDescription());
        System.out.println("Giá: " + coffee.cost());
    }
}
