package B6_Composite;

// Composite
public class NutTrong extends Nut {
    Nut trai = null;
    Nut phai = null;

    public NutTrong(String content) {
        super(content);
    }

    @Override
    void ThemTrai(Nut n) {
        this.trai = n;
    }

    @Override
    void ThemPhai(Nut n) {
        this.phai = n;
    }

    @Override
    void Xoa(Nut n) {
        if (n == trai) {
            trai = null;
        } else if (n == phai) {
            phai = null;
        }
    }

    @Override
    void duyet() {
        if (trai != null) {
            trai.duyet();
        }
        System.out.println(content);
        if (phai != null) {
            phai.duyet();
        }
    }
}
