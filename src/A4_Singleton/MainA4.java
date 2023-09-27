package A4_Singleton;

public class MainA4 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");

        user1.vote("Donald Trump");
        user2.vote("Joe Biden");
        user1.vote("Joe Biden"); // This vote should not be counted

        System.out.println("Votes for Donald Trump: " + Election.getInstance().getVotes("Donald Trump"));
        System.out.println("Votes for Joe Biden: " + Election.getInstance().getVotes("Joe Biden"));
    }
}
