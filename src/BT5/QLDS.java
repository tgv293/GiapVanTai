package BT5;

import java.util.ArrayList;

public class QLDS implements IQLDS {
    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (CaNhan p : dsCaNhan) {
            if (p.getHoTen().equals(ten)) {
                dsCaNhan.remove(p);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public void inDS() {
        for (CaNhan p : dsCaNhan) {
            System.out.println(p.HienThiTT());
        }
    }
}
