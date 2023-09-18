package CC1_STRATERYPATTERN;

public class MainCC1 {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + context.executeTinh(75, 12));

        context.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + context.executeTinh(54, 78));
    }
}
