package stratery.duckexample;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squack());
        duck.setFlyBehavior(new FlyCircle());
        duck.setFlyBehavior(new FlyStraight());
        duck.display();
    }
}
