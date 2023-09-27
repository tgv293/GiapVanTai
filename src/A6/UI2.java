package A6;

public class UI2 {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccessFactory.createDataAccess(DataAccessFactory.DataAccessType.DATA_ACCESS_2);

        SanPham sp2 = new SanPham();
        sp2.setMaSanPham("SP02");
        sp2.setTenSanPham("San pham 02");
        sp2.setSoLuong(20);
        sp2.setDonGia(20000);

        dataAccess.them(sp2);
        dataAccess.hienThiSanPham();
    }
}
