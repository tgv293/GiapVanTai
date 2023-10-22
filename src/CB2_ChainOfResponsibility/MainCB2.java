package CB2_ChainOfResponsibility;

public class MainCB2 {
    public static void main(String[] args) {
        IXLKhoanVay phoTruongPhong = new NhanVienDuyetVay("Hưng","Phó trưởng phòng",100000);
        IXLKhoanVay truongPhong = new NhanVienDuyetVay("Quốc","Trưởng phòng",1000000);
        IXLKhoanVay giamDoc = new NhanVienDuyetVay("Thắng","Giám đốc",1000000);
        IXLKhoanVay chuTich = new ChuTichDuyetVay("Tài",100000000);

        phoTruongPhong.capCaoHon(truongPhong)
                .capCaoHon(giamDoc)
                .capCaoHon(chuTich);

        System.out.println(phoTruongPhong.xuLyVay("Tòa nhà 20 tầng", 10000000));
    }
}
