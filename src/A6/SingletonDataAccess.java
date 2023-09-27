package A6;

public class SingletonDataAccess {
    private static DataAccess instance;

    private SingletonDataAccess() {}

    public static synchronized DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }
}
