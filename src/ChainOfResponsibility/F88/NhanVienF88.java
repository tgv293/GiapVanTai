package ChainOfResponsibility.F88;

public class NhanVienF88 implements IXuLyKhoanVay {
    IXuLyKhoanVay capCaoHon;
    String ten, chucVu;
    int hanMucVay;

    public NhanVienF88(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xuLyKhoanVay) {
        capCaoHon = xuLyKhoanVay;
        return xuLyKhoanVay;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if (tienVay <= hanMucVay)
            return chucVu + ten + "xử lý khoản vay";
        else
            return capCaoHon.xuLyVay(tienVay);
    }
}
