package CD3_TemplateMethod;

public class SortProductByName extends SortCollection<Product>{


    @Override
    protected int myCompare(Product t1, Product t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
