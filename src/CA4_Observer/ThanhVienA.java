package CA4_Observer;

public class ThanhVienA implements Topic.TopicObserver {
    Topic subject;

    public ThanhVienA(Topic topic) {
        this.subject = topic;
        topic.dangKy(this);
    }

    @Override
    public void tinMoi(TinTuc t) {
        System.out.println("Tv A có tin mới:");
        System.out.println("Id " + ": " + t.id);
        System.out.println("Nội dung " + ": " + t.id);
    }

    @Override
    public void capNhat(TinTuc t) {
        System.out.println("Tv A cập nhật tin cũ:");
        System.out.println("Id " + ": " + t.id);
        System.out.println("Nội dung " + ": " + t.id);
    }
}