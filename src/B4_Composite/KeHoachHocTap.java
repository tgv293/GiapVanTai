package B4_Composite;

public abstract class KeHoachHocTap {
    String name;

    public KeHoachHocTap(String name) {
        this.name = name;
    }

    public abstract void Add(KeHoachHocTap keHoachHocTap);

    public abstract void Remove(KeHoachHocTap keHoachHocTap);

    public abstract int getSoTC();

    public abstract int getHocPhi();
}
