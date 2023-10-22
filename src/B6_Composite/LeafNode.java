package B6_Composite;

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
