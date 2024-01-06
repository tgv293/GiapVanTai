package BT5;

public interface IQLDS {
    /**
     * Phương thức để thêm một cá nhân vào danh sách.
     *
     * @param p Đối tượng cá nhân cần được thêm vào danh sách.
     * @return 1 nếu thêm thành công, 0 nếu thất bại.
     */
    int them(CaNhan p);

    /**
     * Phương thức để xóa một cá nhân từ danh sách dựa trên tên.
     *
     * @param ten Tên của cá nhân cần xóa.
     * @return 1 nếu xóa thành công, 0 nếu thất bại hoặc cá nhân không tồn tại.
     */
    int xoa(String ten);

    /**
     * Phương thức để in danh sách các cá nhân trong danh sách.
     */
    void inDS();
}
