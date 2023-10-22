package CB4_ChainOfResponsibility;

public class MainDoVeSo {
    public static void main(String[] args) {
        DoVeSo giaiDB = new GiaiThuong("Giải Đặc Biệt", new String[]{"249660"});
        DoVeSo giaiNhat = new GiaiThuong("Giải Nhất", new String[]{"36268"});
        DoVeSo giaiNhi = new GiaiThuong("Giải Nhì", new String[]{"51090"});
        DoVeSo giaiBa = new GiaiThuong("Giải Ba", new String[]{"50532", "32381"});
        DoVeSo giaiTu = new GiaiThuong("Giải Tư", new String[]{"03514", "88419", "17221", "78331", "87167", "61796", "66330"});
        DoVeSo giaiNam = new GiaiThuong("Giải Năm", new String[]{"2195"});
        DoVeSo giaiSau = new GiaiThuong("Giải Sáu", new String[]{"3585", "7370", "4062"});
        DoVeSo giaiBay = new GiaiThuong("Giải Bảy", new String[]{"255"});
        DoVeSo giaiTam = new GiaiSauCung("Giải Tám", new String[]{"85"});
        DoVeSo giaiKK= new GiaiKhuyenKhich("Giải Khuyến Khích", "249660");


        giaiDB.giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiNhi)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiNam)
                .giaiKeTiep(giaiSau)
                .giaiKeTiep(giaiBay)
                .giaiKeTiep(giaiTam)
                .giaiKeTiep(giaiKK);

        String[] veSoResults = {"249650", "255678", "651265"};

        for (String veSo : veSoResults) {
            String ketQua = giaiDB.TrungGiai(veSo);
            System.out.println(ketQua);
        }
    }
}
