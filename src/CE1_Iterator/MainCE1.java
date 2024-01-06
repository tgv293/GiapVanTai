package CE1_Iterator;

import java.util.*;

public class MainCE1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("My Iterator:");

        ArrayCollection63 arrayCollection63 = new ArrayCollection63();
        Iterator63 iterator63 = arrayCollection63.createIterator();
        while (!iterator63.isDone())
        {
            iterator63.next();
            System.out.println(iterator63.current());
        }
    }
}
