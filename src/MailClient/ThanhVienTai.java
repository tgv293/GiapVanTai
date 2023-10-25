package MailClient;

public class ThanhVienTai implements DiaChiEmailTai {
    private String nameTai, sdtTai, phongBanTai, diaChiEmailTai;

    public ThanhVienTai(String nameTai, String sdtTai, String phongBanTai, String diaChiEmailTai) {
        this.nameTai = nameTai;
        this.sdtTai = sdtTai;
        this.phongBanTai = phongBanTai;
        this.diaChiEmailTai = diaChiEmailTai;
    }

    @Override
    public void sendMail(String message) {
        System.out.println("Sending mail to " + diaChiEmailTai + ": " + message);
    }

    @Override
    public void printInfo() {
        System.out.println("Tên: " + nameTai +
                "\nSố điện thoại: " + sdtTai +
                "\nPhòng ban làm việc: " + phongBanTai +
                "\nĐịa chỉ email: " + diaChiEmailTai);
    }
}