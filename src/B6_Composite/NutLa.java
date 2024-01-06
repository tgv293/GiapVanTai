package B6_Composite;

// Component
public class NutLa extends Nut {

    public NutLa(String content) {
        super(content);
    }

    @Override
    void ThemTrai(Nut n) {

    }

    @Override
    void ThemPhai(Nut n) {

    }

    @Override
    void Xoa(Nut n) {

    }

    @Override
    void duyet() {
        System.out.println(content);
    }
}
