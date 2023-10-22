package Observer;

import java.util.ArrayList;
import java.util.List;

public class TiGia63 {

    List<I_TheodoiTiGia> observers = new ArrayList<>();
    public void attach(I_TheodoiTiGia observer){
        if(!observers.contains(observer))
            observers.add(observer);
    }

    public void detach(I_TheodoiTiGia observer){
        if(observers.contains(observer))
            observers.remove(observer);
    }

    public void thongBaoThayDoi(float delta){
        for(var obs:observers)
            obs.capNhat(delta);
    }

    public static interface  I_TheodoiTiGia{
        void capNhat(float delta);

    }
}