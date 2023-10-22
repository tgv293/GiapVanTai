package CB2_ChainOfResponsibility;

public class NhanVienDuyetVay implements IXLKhoanVay {

    IXLKhoanVay capCaoHon;
    String ten, chucVu;
    int hanMucVay;

    public NhanVienDuyetVay(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }


    @Override
    public IXLKhoanVay capCaoHon(IXLKhoanVay xuLyKhoanVay) {
        capCaoHon = xuLyKhoanVay;
        return xuLyKhoanVay;
    }

    @Override
    public String xuLyVay(String duAn, int tienVay) {
        if (tienVay <= hanMucVay)
            return chucVu + " " + ten + " duyệt dự án " + duAn + " với số tiền vay là: " + tienVay;
        else
            return capCaoHon.xuLyVay(duAn, tienVay);
    }

}
