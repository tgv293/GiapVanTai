package CB1_ChainOfResponsibility;

public interface ATM {

    /**
     * Thiết lập máy ATM với máy ATM tiếp theo trong chuỗi.
     *
     * @param atm Máy ATM tiếp theo trong chuỗi
     * @return Máy ATM với máy ATM tiếp theo được thiết lập.
     */
    ATM menhGiaKeTiep(ATM atm);

    /**
     * Rut tiền từ máy ATM với số tiền và mệnh giá tối đa đã cho.
     *
     * @param soTien     Số tiền cần rút.
     * @param menhGiaMax Mệnh giá tiền tối đa được chấp nhận bởi máy ATM.
     */
    void rutTien(int soTien);
}
