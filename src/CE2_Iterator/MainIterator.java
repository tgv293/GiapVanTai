package CE2_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainIterator {
    public static void inDSMonHoc(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc m = iterator.next();
            System.out.println("Tên môn học: " + m.tenMH);
            System.out.println("Số TC: " + m.soTC);
            System.out.println("..............................................................");
        }
    }

    public static void duyetDSMH(Iterator<MonHoc>iterator, Consumer<MonHoc> consumer) {
        while (iterator.hasNext()) {
            MonHoc m = iterator.next();
            consumer.accept(m);
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list = new ArrayList<>();
        list.add(new MonHoc("Toán",3));
        list.add(new MonHoc("Anh",3));
        list.add(new MonHoc("Lý",3));
        list.add(new MonHoc("Sinh",3));
        list.add(new MonHoc("Hóa",3));
        list.add(new MonHoc("Sử",3));
        list.add(new MonHoc("Địa",3));
        inDSMonHoc(list.iterator());

        System.out.println("Cách 2:");
        duyetDSMH(list.iterator(), new Consumer<MonHoc>() {
            @Override
            public void accept(MonHoc monHoc) {
                System.out.println("Tên môn học: " + monHoc.tenMH);
                System.out.println("Số TC: " + monHoc.soTC);
                System.out.println("..............................................................");
            }
        });
    }
}
