package CB1_ChainOfResponsibility;

public class MainATM {
    public static void main(String[] args) {
        ATM m500 = new ATM_TheoMenhGiaTien(500);
        ATM m100 = new ATM_TheoMenhGiaTien(100);
        ATM m50 = new ATM_TheoMenhGiaTien(50);
        ATM m10 = new ATM_TheoMenhGiaTien(10);
        ATM m1 = new ATM_TheoMenhGiaTien(1);

        m500.menhGiaKeTiep(m100)
                .menhGiaKeTiep(m50)
                .menhGiaKeTiep(m10)
                .menhGiaKeTiep(m1);

        m500.rutTien(293,50);
    }
}
