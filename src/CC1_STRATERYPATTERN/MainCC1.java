package CC1_STRATERYPATTERN;

public class MainCC1 {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + context.tinh(75, 12));

        context.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + context.tinh(54, 78));

        context.setTinhToan(new Chia());
        System.out.println("100 / 2 = " + context.tinh(100,2));

        context.setTinhToan(new Nhan());
        System.out.println("200 * 100 = " + context.tinh(200,100));
    }
}
