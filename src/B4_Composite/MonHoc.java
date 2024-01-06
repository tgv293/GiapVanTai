package B4_Composite;


public class MonHoc extends KeHoachHocTap {
    int soTC;
    int hocPhi; // Học phí cho một tín chỉ

    public MonHoc(String name, int soTC, int hocPhi) {
        super(name);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void Add(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    public void Remove(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return soTC * hocPhi;
    }
}
