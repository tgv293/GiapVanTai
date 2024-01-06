package A6;

import java.util.*;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> dataAccess = new Hashtable<>();
    List<SanPham> dsSanPham = new ArrayList<>();
    private DataAccessUpgrade() {
    }
    public static DataAccessUpgrade getInstance(String tag) {
        if(dataAccess.get(tag) == null) {
            DataAccessUpgrade d = new DataAccessUpgrade();
            dataAccess.put(tag, d);
        }
        return dataAccess.get(tag);
    }

    public void them(SanPham sanPham) {
        dsSanPham.add(sanPham);
    }

    public void xoa(SanPham sanPham) {
        dsSanPham.remove(sanPham);
    }

    public void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi) {
        int index = dsSanPham.indexOf(sanPhamCu);
        if (index != -1) {
            dsSanPham.set(index, sanPhamMoi);
        }
    }

    public void hienThiDSSanPham() {
        dsSanPham.stream().forEach(sanPham -> System.out.println(sanPham));
    }
}
