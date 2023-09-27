package A4_Singleton;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public boolean vote(String candidate) {
        return Election.getInstance().vote(name, candidate);
    }
}
