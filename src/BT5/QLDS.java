package BT5;

import java.util.ArrayList;

/**
 * Lớp QLDS (Quản lý danh sách) là một thành phần quản lý danh sách các cá nhân.
 * Nó triển khai giao diện IQLDS để thêm, xóa, và hiển thị thông tin của các cá nhân trong danh sách.
 */
public class QLDS implements IQLDS {
    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    /**
     * Thêm một cá nhân vào danh sách.
     *
     * @param p Cá nhân cần thêm.
     * @return Trả về 1 nếu thêm thành công, ngược lại trả về 0.
     */
    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    /**
     * Xóa một cá nhân từ danh sách dựa trên tên.
     *
     * @param ten Tên của cá nhân cần xóa.
     * @return Trả về 1 nếu xóa thành công, ngược lại trả về 0.
     */
    @Override
    public int xoa(String ten) {
        for (CaNhan p : dsCaNhan) {
            if (p.getHoTen().equals(ten)) {
                dsCaNhan.remove(p);
                return 1;
            }
        }
        return 0;
    }

    /**
     * Hiển thị thông tin của tất cả các cá nhân trong danh sách.
     */
    @Override
    public void inDS() {
        for (CaNhan p : dsCaNhan) {
            System.out.println(p.HienThiTT());
        }
    }
}
