package factory.pizza;

public class NoPizza extends Pizza {
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }

    @Override
    public String toString() {
        return "No Pizza";
    }
}
