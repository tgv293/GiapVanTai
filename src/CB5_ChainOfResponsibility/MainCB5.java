package CB5_ChainOfResponsibility;

public class MainCB5 {
    public static void main(String[] args) {
        DoHocLuc yeu = new LoaiHocLucTiepTheo(5, "Yếu");
        DoHocLuc trungBinh = new LoaiHocLucTiepTheo(6, "Trung bình");
        DoHocLuc kha = new LoaiHocLucTiepTheo(8, "Khá");
        DoHocLuc gioi = new LoaiHocLucTiepTheo(9, "Giỏi");
        DoHocLuc xuatSac = new LoaiHocLucCuoiCung("Xuất sắc");

        yeu.xepLoaiKeTiep(trungBinh)
                .xepLoaiKeTiep(kha)
                .xepLoaiKeTiep(gioi)
                .xepLoaiKeTiep(xuatSac);

        double diem = 7.5;
        System.out.println(yeu.loaiHocLuc(diem));
    }
}
