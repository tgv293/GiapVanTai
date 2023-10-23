package CA1_OBSERVERPATTERN;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Stream đại diện cho luồng dữ liệu và là thành phần chính của mô hình Observer.
 */
public class Stream {
    private static Stream instance;
    private List<Listener> listeners = new ArrayList<>();
    private List<String> data = new ArrayList<>();

    private Stream() {
    }

    /**
     * Phương thức tạo một instance duy nhất của lớp Stream (Singleton pattern).
     *
     * @return Instance duy nhất của lớp Stream.
     */
    public static Stream getInstance() {
        if (instance == null) {
            instance = new Stream();
        }
        return instance;
    }

    /**
     * Đăng ký một đối tượng Listener để theo dõi luồng dữ liệu.
     *
     * @param listener Đối tượng Listener để đăng ký.
     */
    public void attach(Listener listener) {
        if (!listeners.contains(listener))
            listeners.add(listener);
    }

    /**
     * Hủy đăng ký một đối tượng Listener để ngừng theo dõi luồng dữ liệu.
     *
     * @param listener Đối tượng Listener để hủy đăng ký.
     */
    public void detach(Listener listener) {
        if (listeners.contains(listener))
            listeners.remove(listener);
    }

    /**
     * Thêm một sự kiện mới vào luồng dữ liệu và thông báo tới tất cả Listener.
     *
     * @param t Sự kiện mới được thêm vào luồng dữ liệu.
     */
    void addEvent(String t) {
        data.add(t);
        for (Listener listener : listeners) {
            listener.update(null, t, "ADD");
        }
    }

    /**
     * Cập nhật một sự kiện trong luồng dữ liệu và thông báo tới tất cả Listener.
     *
     * @param oldEvent Sự kiện cũ cần cập nhật.
     * @param newEvent Sự kiện mới thay thế.
     */
    void updateEvent(String oldEvent, String newEvent) {
        int index = data.indexOf(oldEvent);
        if (index != -1) {
            data.set(index, newEvent);
            for (Listener listener : listeners) {
                listener.update(oldEvent, newEvent, "UPDATE");
            }
        }
    }

    /**
     * Xóa một sự kiện khỏi luồng dữ liệu và thông báo tới tất cả Listener.
     *
     * @param t Sự kiện cần xóa.
     */
    void deleteEvent(String t) {
        data.remove(t);
        for (Listener listener : listeners) {
            listener.update(t, null, "DELETE");
        }
    }

    /**
     * Giao diện Listener đại diện cho các đối tượng theo dõi luồng dữ liệu và phản ứng khi có sự thay đổi.
     */
    public static interface Listener {
        void update(String oldEvent, String newEvent, String action);
    }
}
