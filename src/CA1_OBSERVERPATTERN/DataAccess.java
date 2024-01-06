package CA1_OBSERVERPATTERN;

import B4_Composite.MonHoc;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHocCA1> monHocs = new ArrayList<>();
    MyStream<List<MonHocCA1>> myStream;

    public DataAccess(MyStream<List<MonHocCA1>> myStream) {
        this.myStream = myStream;
    }

    public void add(MonHocCA1 m) {
        monHocs.add(m);
        myStream.addEvent(monHocs);
    }

    public void remove(String maMH) {
        MonHocCA1 m = null;
        for (MonHocCA1 mh : monHocs)
            if (mh.maMH.equals(maMH)) {
                m = mh;
                break;
            }
        if (m != null) {
            monHocs.remove(m);
            myStream.addEvent(monHocs);
        }
    }
}
