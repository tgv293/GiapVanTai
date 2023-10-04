package A4_Singleton;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void vote(Candidate c) {
        Election.getInstance().vote(c, name);
    }
}
