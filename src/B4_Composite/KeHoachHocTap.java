package B4_Composite;

/**
 * Lớp trừu tượng KeHoachHocTap đại diện cho thành phần trong mô hình Composite, cả các kế hoạch tổng hợp và cụ thể cần triển khai.
 */
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
