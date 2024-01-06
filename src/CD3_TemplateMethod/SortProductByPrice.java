package CD3_TemplateMethod;

public class SortProductByPrice extends SortCollection<Product>{
    @Override
    protected int myCompare(Product t1, Product t2) {
        return Integer.compare(t1.getPrice(),t2.getPrice());
    }
}
