package CD3_TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MainSortCollection {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Áo thun", 100, 10));
        list.add(new Product("Quần Jean", 200, 20));
        list.add(new Product("Áo khoác", 150, 15));
        SortCollection<Product> sortByName = new SortProductByName();
        sortByName.sort(list);
        for (Product product : list) {
            System.out.println(product.getName());
        }
        SortCollection<Product> sortByPrice = new SortProductByPrice();
        sortByPrice.sort(list);
        for (Product product : list) {
            System.out.println(product.getName());
        }
    }
}
