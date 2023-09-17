package BT5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QLDS implements IQLDS {
    private List<CaNhan> dsCaNhan;

    public QLDS() {
        dsCaNhan = new ArrayList<>();
    }

    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return dsCaNhan.size();
    }

    @Override
    public int xoa(String ten) {
        int count = 0;
        Iterator<CaNhan> iterator = dsCaNhan.iterator();
        while (iterator.hasNext()) {
            CaNhan p = iterator.next();
            if (p.hoTen.equals(ten)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    @Override
    public void inDS() {
        for (CaNhan p : dsCaNhan) {
            System.out.println(p.HienThiTT());
        }
    }
}
