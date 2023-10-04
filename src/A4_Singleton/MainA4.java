package A4_Singleton;

public class MainA4 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");

        user1.vote(Candidate.Trump);
        user2.vote(Candidate.Biden);
        user2.vote(Candidate.Biden);
        user2.vote(Candidate.Trump);

        System.out.println("Kết quả bầu cử:");
        System.out.println("Trump: " + Election.getInstance().getTrump());
        System.out.println("Biden: " + Election.getInstance().getBiden());
        Election.getInstance().printVoters();
    }
}
