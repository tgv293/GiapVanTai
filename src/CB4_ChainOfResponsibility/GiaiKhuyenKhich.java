package CB4_ChainOfResponsibility;

public class GiaiKhuyenKhich implements DoVeSo {
    private DoVeSo giaiKeTiep;
    private String tenGiai;
    private String boSoTrungThuong;

    public GiaiKhuyenKhich(String tenGiai, String boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public DoVeSo giaiKeTiep(DoVeSo giaiKeTiep) {
        this.giaiKeTiep = giaiKeTiep;
        return giaiKeTiep;
    }

    @Override
    public String TrungGiai(String veSo) {
        if (boSoTrungThuong.length() != 6) {
            return "Lỗi: Giải khuyến khích cần 6 con số trúng thưởng.";
        }

        if (veSo.charAt(0) != boSoTrungThuong.charAt(0)) {
            return "Chúc may mắn lần sau!";
        }

        int diffCount = 0;
        for (int i = 1; i < 6; i++) {
            if (veSo.charAt(i) != boSoTrungThuong.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 1) {
                return "Chúc may mắn lần sau!";
            }
        }
        if (diffCount == 1) {
            return "Chúc mừng, bạn đã trúng giải " + tenGiai + " với số: " + veSo;
        }
        return "Chúc may mắn lần sau!";
    }
}