package CA2_Observer;

public class Button {
    OnClickListener activity;

    /**
     * Phương thức này dùng để đăng ký một đối tượng làm người nghe cho sự kiện nhấn nút.
     *
     * @param activity Đối tượng làm người nghe sự kiện nhấn nút.
     */
    public void attach(OnClickListener activity) {
        this.activity = activity;
    }

    /**
     * Phương thức này dùng để hủy đăng ký đối tượng làm người nghe cho sự kiện nhấn nút.
     */
    public void detach() {
        this.activity = null;
    }

    /**
     * Phương thức này được gọi khi nút được nhấn. Nó kiểm tra xem đã đăng ký người nghe sự kiện hay chưa và gọi sự kiện `onClick` tương ứng.
     */
    public void click() {
        if (activity != null)
            activity.onClick();
    }

    /**
     * Giao diện OnClickListener đại diện cho người nghe sự kiện khi nút được nhấn.
     */
    public static interface OnClickListener {
        void onClick();
    }
}
