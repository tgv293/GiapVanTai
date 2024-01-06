package CA1_OBSERVERPATTERN;

import java.util.List;

public class MainCA1 {
    public static void main(String[] args) {
        MyStream<List<MonHocCA1>> stream = new MyStream<>();
        MyClient client = new MyClient(stream);

        DataAccess dataAccess = new DataAccess(stream);
        dataAccess.add(new MonHocCA1("001", "Lịch sử Đảng", 3));
        dataAccess.add(new MonHocCA1("002", "Pháp luật đại cương", 1));

        dataAccess.remove("002");
    }
}
