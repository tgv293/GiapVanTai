package CD2_TemplateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp EntityDB là một lớp trừu tượng đại diện cho một cơ sở dữ liệu đơn giản với các hoạt động cơ bản như thêm, cập nhật, xóa và tìm kiếm dựa trên một danh sách các đối tượng kiểu T.
 * Đây là một ví dụ về mô hình Template Method, trong đó các phương thức cụ thể được triển khai bởi các lớp con.
 *
 * @param <T> Kiểu dữ liệu của các đối tượng trong cơ sở dữ liệu.
 */
public abstract class EntityDB<T> {
    List<T> list = new ArrayList<>();

    /**
     * Phương thức trừu tượng để lấy ID của một đối tượng kiểu T.
     *
     * @param t Đối tượng cần lấy ID.
     * @return ID của đối tượng.
     */
    protected abstract int getId(T t);

    public boolean add(T t) {
        for (T o : list)
            if (getId(o) == getId(t))
                return false;
        list.add(t);
        return true;
    }

    public int update(T t) {
        for (int i = 0; i < list.size(); i++)
            if (getId(t) == getId(list.get(i))) {
                list.set(i, t);
                return 1;
            }
        return 0;
    }

    public int delete(T t) {
        return deleteById(getId(t));
    }

    public T findById(int id) {
        for (T o : list)
            if (getId(o) == id)
                return o;
        return null;
    }

    public int deleteById(int id) {
        for (T o : list) {
            if (getId(o) == id) {
                list.remove(o);
                return 1;
            }
        }
        return 0;
    }

    public void printInfo() {
        for (T t : list) {
            System.out.println(t.toString());
        }
    }
}
