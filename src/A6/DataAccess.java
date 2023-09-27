package A6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private List<SanPham> sanPhams;

    public DataAccess() {
        sanPhams = new ArrayList<>();
    }

    public void them(SanPham sanPham) {
        sanPhams.add(sanPham);
    }

    public void xoa(SanPham sanPham) {
        sanPhams.remove(sanPham);
    }

    public void capNhat(SanPham sanPham) {
        // update product
    }

    public void hienThiSanPham() {
        for (SanPham sanPham : sanPhams) {
            System.out.println("Ma San Pham: " + sanPham.getMaSanPham());
            System.out.println("Ten San Pham: " + sanPham.getTenSanPham());
            System.out.println("So Luong: " + sanPham.getSoLuong());
            System.out.println("Don Gia: " + sanPham.getDonGia());
            System.out.println("-------------------------");
        }
    }

}
