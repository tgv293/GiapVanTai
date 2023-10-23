package A4_Singleton;

/**
 * Lớp User đại diện cho một người dùng tham gia vào quá trình bầu cử và có khả năng bỏ phiếu cho ứng viên.
 */
public class User {
    private String name;

    /**
     * Constructor để khởi tạo một đối tượng người dùng với tên cụ thể.
     *
     * @param name Tên của người dùng
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Phương thức này cho phép người dùng bỏ phiếu cho một ứng viên cụ thể trong quá trình bầu cử.
     *
     * @param c Ứng viên mà người dùng muốn bỏ phiếu ủng hộ
     */
    public void vote(Candidate c) {
        Election.getInstance().vote(c, name);
    }
}
