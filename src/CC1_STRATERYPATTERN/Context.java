package CC1_STRATERYPATTERN;

public class Context {
    private Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float executeTinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }
}
