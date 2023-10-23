package A6;

import java.util.HashMap;
import java.util.Map;

/**
 * Lớp DataAccessFactory là một factory class (lớp tạo) để tạo đối tượng DataAccess dựa trên loại được chỉ định.
 * Lớp này sử dụng một cơ chế caching để đảm bảo rằng chỉ một thể hiện DataAccess duy nhất được tạo cho mỗi loại.
 */
public class DataAccessFactory {
    private static Map<String, DataAccess> instances = new HashMap<>(); // Bản đồ lưu trữ các thể hiện DataAccess theo loại

    /**
     * Phương thức này tạo hoặc trả về thể hiện DataAccess tương ứng với loại được chỉ định.
     *
     * @param type Loại DataAccess muốn tạo
     * @return Thể hiện của DataAccess tương ứng với loại
     */
    public static DataAccess getDataAccess(String type) {
        if (!instances.containsKey(type)) {
            instances.put(type, new DataAccess());
        }
        return instances.get(type);
    }
}
