package A4_Singleton;

import java.util.*;

/**
 * Lớp Election là một ví dụ về mô hình Singleton và đại diện cho quá trình bầu cử của hai ứng viên Trump và Biden.
 */
public class Election {
    private static Election instance;
    private int Trump;      // Số phiếu ủng hộ cho ứng viên Trump
    private int Biden;      // Số phiếu ủng hộ cho ứng viên Biden
    private List<String> usersVoted; // Danh sách người đã bỏ phiếu

    /**
     * Constructor ẩn định để đảm bảo rằng không thể tạo nhiều thể hiện của lớp Election.
     */
    private Election() {
        Trump = 0;
        Biden = 0;
        usersVoted = new ArrayList<>();
    }

    /**
     * Phương thức này trả về một thể hiện của lớp Election (nếu đã được tạo), hoặc tạo một thể hiện mới nếu chưa tồn tại.
     *
     * @return Thể hiện duy nhất của lớp Election
     */
    public static Election getInstance() {
        if (instance == null)
            instance = new Election();
        return instance;
    }

    /**
     * Phương thức này cho phép một người bỏ phiếu cho một trong hai ứng viên và kiểm tra xem họ đã bỏ phiếu trước đó chưa.
     *
     * @param c     Ứng viên mà người bỏ phiếu ủng hộ
     * @param user  Tên người bỏ phiếu
     */
    public void vote(Candidate c, String user) {
        if (!usersVoted.contains(user)) {
            if (c == Candidate.Trump) {
                Trump++;
            } else if (c == Candidate.Biden) {
                Biden++;
            }
            usersVoted.add(user);
        } else {
            System.out.println(user + " đã bỏ phiếu.");
        }
    }

    /**
     * Phương thức này in ra danh sách người đã bỏ phiếu.
     */
    public void printVoters() {
        System.out.println("Danh sách người đã bỏ phiếu:");
        for (String user : usersVoted) {
            System.out.println(user);
        }
    }

    /**
     * Phương thức này trả về số phiếu ủng hộ cho ứng viên Trump.
     *
     * @return Số phiếu ủng hộ cho ứng viên Trump
     */
    public int getTrump() {
        return Trump;
    }

    /**
     * Phương thức này trả về số phiếu ủng hộ cho ứng viên Biden.
     *
     * @return Số phiếu ủng hộ cho ứng viên Biden
     */
    public int getBiden() {
        return Biden;
    }
}
