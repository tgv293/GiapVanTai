package singleton.vidu;

public class MainViDu {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.print();
        s1.print();
        s1.print();
        s2.print();
        s2.print();
    }
}
