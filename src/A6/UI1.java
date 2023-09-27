package A6;

public class UI1 {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccessFactory.createDataAccess(DataAccessFactory.DataAccessType.DATA_ACCESS_1);

        SanPham sp1 = new SanPham();
        sp1.setMaSanPham("SP01");
        sp1.setTenSanPham("San pham 01");
        sp1.setSoLuong(10);
        sp1.setDonGia(10000);

        dataAccess.them(sp1);
        dataAccess.hienThiSanPham();
    }
}
