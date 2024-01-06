package CB5_ChainOfResponsibility;

public class LoaiHocLucCuoiCung implements DoHocLuc{
    String hocLuc;

    public LoaiHocLucCuoiCung(String hocLuc) {
        this.hocLuc = hocLuc;
    }

    @Override
    public DoHocLuc xepLoaiKeTiep(DoHocLuc xepLoaiKeTiep) {
        return null;
    }

    @Override
    public String loaiHocLuc(double diem) {
        return hocLuc;
    }
}
