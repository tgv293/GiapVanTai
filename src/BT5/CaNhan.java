package BT5;

public abstract class CaNhan {
     String hoTen;
     int tuoi;
     String diaChi;
     String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public abstract String HienThiTT();
}
