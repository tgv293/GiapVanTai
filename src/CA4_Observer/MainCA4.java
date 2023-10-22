package CA4_Observer;

public class MainCA4 {
    public static void main(String[] args) {
        Topic chuDe = new Topic();

        ThanhVienA thanhVienA = new ThanhVienA(chuDe);
        ThanhVienB thanhVienB = new ThanhVienB(chuDe);

        chuDe.taoTinMoi("Xin chào thế giới");

        thanhVienA.huyDangKyThanhVien();

        chuDe.capNhatTin("Xin chào Việt Nam");
    }
}
