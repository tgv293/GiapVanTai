package BT4;

/**
 * Lớp QuanLyChuyenXe chứa danh sách các chuyến xe và cung cấp các phương thức để quản lý và tính toán doanh thu.
 */

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    // Danh sách chuyến xe
    List<ChuyenXe> dsCX = new ArrayList();

    /**
     * Thêm một chuyến xe vào danh sách.
     *
     * @param cx Chuyến xe cần thêm.
     */
    public void them(ChuyenXe cx) {
        dsCX.add(cx);
    }

    /**
     * In danh sách các chuyến xe ra màn hình.
     */
    public void inDS() {
        for (ChuyenXe cx : dsCX) {
            System.out.println(cx.toString());
        }
    }

    /**
     * Tính tổng doanh thu của các chuyến xe nội thành.
     *
     * @return Tổng doanh thu xe nội thành.
     */
    public int doanhThuXeNoiThanh() {
        int tong = 0;
        for (ChuyenXe cx : dsCX) {
            if (cx instanceof ChuyenXeNoiThanh) {
                tong += cx.doanhThu;
            }
        }
        return tong;
    }

    /**
     * Tính tổng doanh thu của các chuyến xe ngoại thành.
     *
     * @return Tổng doanh thu xe ngoại thành.
     */
    public int doanhThuXeNgoaiThanh() {
        int tong = 0;
        for (ChuyenXe cx : dsCX) {
            if (cx instanceof ChuyenXeNgoaiThanh) {
                tong += cx.doanhThu;
            }
        }
        return tong;
    }

    /**
     * Tính tổng doanh thu của cả hai loại chuyến xe (nội thành và ngoại thành).
     *
     * @return Tổng doanh thu cả hai loại xe.
     */
    public int tongDoanhThu() {
        return doanhThuXeNgoaiThanh() + doanhThuXeNoiThanh();
    }
}
