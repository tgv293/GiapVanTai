package CA4_Observer;

import java.util.ArrayList;
import java.util.List;
// Subject
public class Topic {
    List<TopicObserver> observers = new ArrayList<>();
    List<TinTuc> listTin = new ArrayList<>();

    public void dangKy(TopicObserver observer) {
        observers.add(observer);
    }

    public void huyDangKy(TopicObserver observer) {
        observers.remove(observer);
    }
    public void tinMoi(TinTuc t){
        listTin.add(t);
        for (TopicObserver o: observers){
            o.tinMoi(t);
        }
    }
    public void capNhat(TinTuc t){
        for (TinTuc tin: listTin){
            if (tin.id == t.id){
                tin.content = t.content;
                for (TopicObserver o: observers){
                    o.capNhat(t);
                }
            }
        }
    }
    public static interface TopicObserver {
        void tinMoi(TinTuc t);
        void capNhat(TinTuc t);
    }
}