package MailClient;

public class MainMailClient {
    public static void main(String[] args) {
        ThanhVienTai thanhVien1 = new ThanhVienTai("Giáp Văn Tài", "0773753848", "Công nghệ", "tai.gv.63cntt@ntu.edu.vn");
        NhomThanhVienTai nhomThanhVienTai = new NhomThanhVienTai();
        nhomThanhVienTai.add(thanhVien1);

        nhomThanhVienTai.sendMail("Hello, World!");
        nhomThanhVienTai.printInfo();
    }
}