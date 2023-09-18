package CC2_STRATERYPATTERN;

import java.util.Date;

public class MainCC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();

        qlsv.dsSV.add(new SinhVien("Nguyen Van A", new Date(2000, 1, 1), 7.5f));
        qlsv.dsSV.add(new SinhVien("Le Thi B", new Date(2000, 5, 20), 8.0f));

        System.out.println("So sánh theo tên:");
        qlsv.soSanh = new SoSanhTheoTen();
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("So sánh theo điểm:");
        qlsv.soSanh = new SoSanhTheoDiem();
        qlsv.sapXep();
        qlsv.inDS();
    }
}
