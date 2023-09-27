package factory.pizza;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new VN_PizzaStore();
        Pizza pizza = pizzaStore.order(PizzaType.Seafood);
        System.out.println(pizza.toString());
    }
}
