package CA2_Observer;

/**
 * Lớp Activity đại diện cho hoạt động trong ứng dụng và là một Listener cho sự kiện nhấn nút.
 */
public class Activity implements Button.OnClickListener {
    Button myButton;
    int clickCount = 0;

    /**
     * Phương thức khởi tạo một Activity và đăng ký nó như là một Listener cho nút được cung cấp.
     *
     * @param myButton Nút mà hoạt động này đăng ký để theo dõi sự kiện nhấn.
     */
    public Activity(Button myButton) {
        this.myButton = myButton;
        myButton.attach(this);
    }

    /**
     * Phương thức được gọi khi nút được nhấn. Nó tăng số lần nhấn và in thông báo ra màn hình.
     */
    @Override
    public void onClick() {
        System.out.println("Bạn đã nhấn " + (++clickCount) + " lần");
    }
}
