package CB5_ChainOfResponsibility;

public interface DoHocLuc {
    DoHocLuc xepLoaiKeTiep(DoHocLuc xepLoaiKeTiep);
    String loaiHocLuc(double diem);
}
