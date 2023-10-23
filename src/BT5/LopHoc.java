package BT5;

/**
 * Lớp LopHoc đại diện cho một lớp học và quản lý danh sách học sinh và giáo viên giảng dạy trong lớp.
 */
public class LopHoc {
    QLDS qldsHS = new QLDS(); // Danh sách quản lý học sinh
    QLDS qldsGVGD = new QLDS(); // Danh sách quản lý giáo viên giảng dạy

    /**
     * Phương thức để thêm một học sinh vào danh sách học sinh của lớp.
     *
     * @param hs Đối tượng học sinh cần được thêm vào danh sách.
     * @return 1 nếu thêm thành công, 0 nếu thất bại.
     */
    int themHocSinh(HocSinh hs) {
        qldsHS.them(hs);
        return 1;
    }

    /**
     * Phương thức để thêm một giáo viên vào danh sách giáo viên giảng dạy của lớp.
     *
     * @param gv Đối tượng giáo viên cần được thêm vào danh sách.
     * @return 1 nếu thêm thành công, 0 nếu thất bại.
     */
    int themGVGD(GiaoVien gv) {
        qldsGVGD.them(gv);
        return 1;
    }

    /**
     * Phương thức để in danh sách các học sinh trong lớp.
     */
    void inDSHS() {
        qldsHS.inDS();
    }

    /**
     * Phương thức để in danh sách các giáo viên giảng dạy trong lớp.
     */
    void inDSGVGD() {
        qldsGVGD.inDS();
    }
}
