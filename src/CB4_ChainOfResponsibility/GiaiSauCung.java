package CB4_ChainOfResponsibility;

public class GiaiSauCung implements DoVeSo {
    DoVeSo giaiKeTiep;
    String tenGiai;
    String[] boSoTrungThuong;

    public GiaiSauCung(String tenGiai, String[] boSoTrungThuong) {
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
        for (String boSo : boSoTrungThuong) {
            if (veSo.endsWith(boSo)) {
                return "Chúc mừng, bạn đã trúng giải " + tenGiai + " với số: " + veSo;
            }
        }
        if (giaiKeTiep != null) {
            return giaiKeTiep.TrungGiai(veSo);
        }
        return "Chúc may mắn lần sau!";
    }
}
