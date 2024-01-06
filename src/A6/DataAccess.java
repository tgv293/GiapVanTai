package A6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;

    public DataAccess() {}

    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }
}
