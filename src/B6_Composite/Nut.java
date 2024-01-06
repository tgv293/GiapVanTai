package B6_Composite;

public abstract class Nut {
    String content;

    public Nut(String content) {
        this.content = content;
    }

    abstract void ThemTrai(Nut n);
    abstract void ThemPhai(Nut n);
    abstract void Xoa(Nut n);
    abstract void duyet();
}
