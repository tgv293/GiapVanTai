package CD2_TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityDB<T> {
    List<T> list = new ArrayList<>();

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
        for(T o : list)
            if(getId(o) == id)
                return o;
        return null;
    }

    public int deleteById(int id) {
        for(T o : list) {
            if(getId(o) == id) {
                list.remove(o);
                return 1;
            }
        }
        return 0;
    }

    public void printInfo() {
        for(T t:list){
            System.out.println(t.toString());
        }
    }
}
