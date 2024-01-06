package BT2;

import BT1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {

    List<NhanVien> dsNV = new ArrayList<>();

    @Override
    public void themNV(NhanVien nv) {
        dsNV.add(nv);
    }

    @Override
    public void inDS() {
        for (NhanVien nv : dsNV)
            System.out.println(nv.getThongTin());
    }
}
