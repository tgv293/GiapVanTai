package B4_Composite;


import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap {
    List<KeHoachHocTap> list = new ArrayList<>();

    public KeHoachChung(String name) {
        super(name);
    }

    @Override
    public void Add(KeHoachHocTap keHoachHocTap) {
        list.add(keHoachHocTap);
    }

    @Override
    public void Remove(KeHoachHocTap keHoachHocTap) {
        list.remove(keHoachHocTap);
    }

    @Override
    public int getSoTC() {
        int tong = 0;
        for (KeHoachHocTap k : list) {
            tong += k.getSoTC();
        }
        return tong;
    }

    @Override
    public int getHocPhi() {
        int tong = 0;
        for (KeHoachHocTap k : list) {
            tong += k.getHocPhi();
        }
        return tong;
    }
}
