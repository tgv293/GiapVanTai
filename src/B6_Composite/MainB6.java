package B6_Composite;

public class MainB6 {
    public static void main(String[] args) {
        // Tạo cây nhị phân
        CompositeNode root = new CompositeNode(1);
        root.setLeft(new LeafNode(2));
        root.setRight(new LeafNode(3));

        // Duyệt cây
        root.duyetCay();
    }
}
