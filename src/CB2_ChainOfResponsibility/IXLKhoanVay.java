package CB2_ChainOfResponsibility;

public interface IXLKhoanVay {
    IXLKhoanVay capCaoHon(IXLKhoanVay xuLyKhoanVay);

    String xuLyVay(String duAn, int tienVay);
}
