package CB5_ChainOfResponsibility;

public class LoaiHocLucTiepTheo implements DoHocLuc {
    double max;
    String hocLuc;
    DoHocLuc bacHocLucTiepTheo;

    public LoaiHocLucTiepTheo(double max, String hocLuc) {
        this.max = max;
        this.hocLuc = hocLuc;
    }

    @Override
    public DoHocLuc xepLoaiKeTiep(DoHocLuc xepLoaiKeTiep) {
        this.bacHocLucTiepTheo = xepLoaiKeTiep;
        return xepLoaiKeTiep;
    }

    @Override
    public String loaiHocLuc(double diem) {
        if (diem > max)
            return bacHocLucTiepTheo.loaiHocLuc(diem);
        else return hocLuc;
    }
}