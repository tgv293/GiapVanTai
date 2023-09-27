package A6;

public class DataAccessFactory {
    public enum DataAccessType { DATA_ACCESS_1, DATA_ACCESS_2 }

    public static DataAccess createDataAccess(DataAccessType dataAccessType) {
        switch (dataAccessType) {
            case DATA_ACCESS_1:
                return SingletonDataAccess.getInstance();
            case DATA_ACCESS_2:
                return new DataAccess(); // or another singleton instance
            default:
                throw new IllegalArgumentException("Invalid data access type");
        }
    }
}