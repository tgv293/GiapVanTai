package BT2;

import BT1.NhanVien;

public interface IQuanLy {
    /**
     * Phương thức để thêm một nhân viên mới.
     *
     * @param nv Đối tượng nhân viên cần thêm.
     */
    void themNV(NhanVien nv);

    /**
     * Phương thức để in danh sách nhân viên.
     */
    void inDS();
}
