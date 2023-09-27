package A6;

public class UI3 {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccessFactory.createDataAccess(DataAccessFactory.DataAccessType.DATA_ACCESS_1);

        SanPham sp3 = new SanPham();
        sp3.setMaSanPham("SP03");
        sp3.setTenSanPham("San pham 03");
        sp3.setSoLuong(30);
        sp3.setDonGia(30000);

        dataAccess.them(sp3);
        dataAccess.hienThiSanPham();
    }
}