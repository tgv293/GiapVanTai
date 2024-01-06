package CB1_ChainOfResponsibility;

public class ATM_Factory {
    ATM m500 = new ATM_TheoMenhGiaTien(500);
    ATM m100 = new ATM_TheoMenhGiaTien(100);
    ATM m50 = new ATM_TheoMenhGiaTien(50);
    ATM m10 = new ATM_TheoMenhGiaTien(10);
    ATM m1 = new ATM_TheoMenhGiaTien(1);

    public ATM_Factory() {
        m500
                .menhGiaKeTiep(m100)
                .menhGiaKeTiep(m50)
                .menhGiaKeTiep(m10)
                .menhGiaKeTiep(m1);
    }

    public ATM getATM(int menhGiaLonNhat) {
        switch (menhGiaLonNhat) {
            case 500:
                return m500;
            case 100:
                return m100;
            case 50:
                return m50;
            case 10:
                return m10;
            case 1:
                return m1;
        }
        return m500;
    }
}
