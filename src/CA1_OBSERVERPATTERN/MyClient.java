package CA1_OBSERVERPATTERN;

import java.util.List;

public class MyClient implements MyStream.IStreamListener<List<MonHocCA1>> {

    MyStream<List<MonHocCA1>> myStream;

    public MyClient(MyStream<List<MonHocCA1>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHocCA1> monHocCA1s) {
        System.out.println("Số lượng môn học: " + monHocCA1s.size());
        for (MonHocCA1 m : monHocCA1s)
            System.out.println(m.toString());
    }
}
