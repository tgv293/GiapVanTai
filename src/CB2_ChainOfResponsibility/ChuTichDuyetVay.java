package CB2_ChainOfResponsibility;

public class ChuTichDuyetVay implements IXLKhoanVay {
    String ten;
    int hanMucVay;

    public ChuTichDuyetVay(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXLKhoanVay capCaoHon(IXLKhoanVay xuLyKhoanVay) {
        return null;
    }

    @Override
    public String xuLyVay(String duAn, int tienVay) {
        if (tienVay <= hanMucVay)
            return "Chủ tịch " + ten + " duyệt dự án " + duAn + " với số tiền vay là: " + tienVay;
        else
            return "Ra ngân hàng vay";
    }
}
