package CB2_ChainOfResponsibility;

/**
 * Lớp ChuTichDuyetVay thực hiện việc duyệt và xử lý các khoản vay với quyền hạn của Chủ tịch và là một phần của mô hình Chain of Responsibility.
 */
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
