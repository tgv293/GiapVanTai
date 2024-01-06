package A4_Singleton;

public class MainA4 {
    public static void main(String[] args) {
        // Tạo các đối tượng người dùng để tham gia bầu cử.
        User user1 = new User("User1");
        User user2 = new User("User2");

        // Người dùng bỏ phiếu cho các ứng viên khác nhau.
        user1.vote(Candidate.Trump);
        user2.vote(Candidate.Biden);
        user2.vote(Candidate.Biden);
        user2.vote(Candidate.Trump);

        // In kết quả bầu cử và danh sách người đã bỏ phiếu.
        System.out.println("Kết quả bầu cử:");
        System.out.println("Trump: " + Election.getInstance().getTrump());
        System.out.println("Biden: " + Election.getInstance().getBiden());
        Election.getInstance().printVoters();
    }
}
