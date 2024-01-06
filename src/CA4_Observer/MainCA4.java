package CA4_Observer;

public class MainCA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA tva = new ThanhVienA(topic);
        ThanhVienB tvb = new ThanhVienB(topic);
        System.out.println("Lần 1");
        topic.tinMoi(new TinTuc(1,"Cô giáo ở Tuyên Quang dồn vào tường"));
        System.out.println("Lần 2");
        topic.tinMoi(new TinTuc(2,"Tiến sĩ bằng giả dạy 6 năm ở Hutech"));
    }
}
