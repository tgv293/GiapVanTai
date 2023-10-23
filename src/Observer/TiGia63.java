package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp TiGia63 đại diện cho tỷ giá và là thành phần chính của mô hình Observer.
 * Nó theo dõi và thông báo các thay đổi trong tỷ giá tới các đối tượng quan sát (observers).
 */
public class TiGia63 {

    List<I_TheodoiTiGia> observers = new ArrayList<>();

    /**
     * Phương thức này cho phép đính kèm một đối tượng quan sát (observer) tới danh sách các observers.
     *
     * @param observer Đối tượng quan sát cần đính kèm.
     */
    public void attach(I_TheodoiTiGia observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    /**
     * Phương thức này cho phép loại bỏ một đối tượng quan sát (observer) khỏi danh sách các observers.
     *
     * @param observer Đối tượng quan sát cần loại bỏ.
     */
    public void detach(I_TheodoiTiGia observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    /**
     * Phương thức này thông báo một thay đổi trong tỷ giá tới tất cả các observers.
     *
     * @param delta Thay đổi tỷ giá.
     */
    public void thongBaoThayDoi(float delta) {
        for (var obs : observers)
            obs.capNhat(delta);
    }

    /**
     * Giao diện I_TheodoiTiGia đại diện cho các đối tượng quan sát (observers).
     * Các observers cần triển khai phương thức capNhat để nhận thông báo về thay đổi tỷ giá.
     */
    public static interface I_TheodoiTiGia {
        void capNhat(float delta);
    }
}
