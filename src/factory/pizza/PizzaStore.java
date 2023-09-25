package factory.pizza;
/*
abstract public class PizzaStore {
    abstract protected Pizza createPizza(PizzaType t);

    public Pizza order(PizzaType t){
        Pizza p = createPizza(t);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
*/
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}