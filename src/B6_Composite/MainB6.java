package B6_Composite;

public class MainB6 {
    public static void main(String[] args) {
        Nut la1 = new NutLa("La 1");
        Nut la2 = new NutLa("La 2");
        Nut la3 = new NutLa("La 3");

        Nut trong1 = new NutTrong("Trong 1");
        Nut trong2 = new NutTrong("Trong 2");

        trong1.ThemTrai(la1);
        trong1.ThemPhai(la2);

        trong2.ThemTrai(la3);

        NutTrong root = new NutTrong("Root");
        root.ThemTrai(trong1);
        root.ThemPhai(trong2);

        inCay(root,0);
    }

    public static void inCay(Nut nut, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        System.out.println(nut.content);
        
        if (nut instanceof NutTrong) {
            NutTrong nutTrong = (NutTrong) nut;
            if (nutTrong.trai != null) {
                inCay(nutTrong.trai, level + 1);
            }
            if (nutTrong.phai != null) {
                inCay(nutTrong.phai, level + 1);
            }
        }
    }
}
