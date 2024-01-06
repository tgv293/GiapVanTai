package CA4_Observer;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.TopicObserver {

    Topic topic;
    List<TinTuc> listTin = new ArrayList<>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.dangKy(this);
    }

    @Override
    public void tinMoi(TinTuc t) {
        listTin.add(0, t);
        for (TinTuc tin : listTin) {
            System.out.println("Id " + ": " + tin.id);
            System.out.println("Nội dung " + ": " + tin.id);
        }
    }

    @Override
    public void capNhat(TinTuc t) {
        for (TinTuc tin : listTin)
            if (t.id == tin.id) {
                tin.content = t.content;
                System.out.println("Tv A cập nhật tin cũ:");
                System.out.println("Id " + ": " + tin.id);
                System.out.println("Nội dung " + ": " + tin.id);
                break;
            }
    }
}