package CB1_ChainOfResponsibility;

public interface ATM {
    ATM menhGiaKeTiep(ATM atm);

    void rutTien(int soTien, int menhGiaMax);

}
