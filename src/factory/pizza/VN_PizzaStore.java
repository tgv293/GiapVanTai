package factory.pizza;

public class VN_PizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType t) {
        switch (t) {
            case Shrimp -> {
                return new VN_PizzaSeafood();
            }
        }
        return new NoPizza();
    }
}

