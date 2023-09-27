package A1_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MainA1 {
    public static void main(String[] args) {
        HoaDonHeader header = new HoaDonHeader();
        header.setMaHoaDon("HD01");
        header.setNgayBan("26/09/2023");
        header.setTenKhachHang("Nguyen Van A");

        List<CTHD> dsCTHD = new ArrayList<>();
        CTHD cthd1 = new CTHD();
        cthd1.setSanPham("SP01");
        cthd1.setSoLuong(10);
        cthd1.setDonGia(20000);
        cthd1.setChietKhau(0.05f);
        dsCTHD.add(cthd1);

        HoaDon hoaDon = new HoaDon.Builder()
                .setHoaDonHeader(header)
                .setDsCTHD(dsCTHD)
                .build();

        System.out.println(hoaDon.toString());

    }
}
