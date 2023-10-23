package B6_Composite;

/**
 * Lớp LeafNode là một lớp cụ thể kế thừa từ Node, đại diện cho các nút lá trong cây Composite.
 */
public class LeafNode extends Node {
    int value;

    LeafNode(int value) {
        this.value = value;
    }

    @Override
    void duyetCay() {
        System.out.println("Leaf Node: " + value);
    }
}
