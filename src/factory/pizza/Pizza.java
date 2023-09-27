package factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    StringBuilder builder = new StringBuilder();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    @Override
    public String toString() {
        return builder.toString();
    }
}

