package A1_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader header; // Thông tin header của hóa đơn
    private List<CTHD> cthds; // Danh sách chi tiết hóa đơn

    // Constructor protected để chỉ có thể được sử dụng bởi lớp Builder.
    protected HoaDon(Builder builder) {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }

    /**
     * Phương thức này trả về một chuỗi biểu diễn của đối tượng HoaDon, bao gồm thông tin header và danh sách chi tiết hóa đơn.
     *
     * @return Chuỗi biểu diễn của đối tượng HoaDon
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        for (CTHD cthd : cthds) {
            builder.append("\n").append(cthd.toString());
        }
        return builder.toString();
    }

    /**
     * Lớp Builder dùng để xây dựng đối tượng HoaDon theo một cách dễ đọc và linh hoạt.
     */
    public static class Builder {
        private HoaDonHeader header; // Thông tin header của hóa đơn
        private List<CTHD> cthds = new ArrayList<>(); // Danh sách chi tiết hóa đơn

        /**
         * Phương thức này thiết lập thông tin header của hóa đơn.
         *
         * @param maHD    Mã hóa đơn
         * @param ngayBan Ngày bán
         * @param tenKH   Tên khách hàng
         * @return Builder để tiếp tục xây dựng hóa đơn
         */
        public Builder setHeader(String maHD, String ngayBan, String tenKH) {
            this.header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }

        /**
         * Phương thức này thêm một chi tiết hóa đơn vào danh sách chi tiết hóa đơn.
         *
         * @param sanPham   Tên sản phẩm
         * @param soLuong   Số lượng sản phẩm
         * @param donGia    Đơn giá sản phẩm
         * @param chietKhau Mức chiết khấu áp dụng cho sản phẩm
         * @return Builder để tiếp tục xây dựng hóa đơn
         */
        public Builder addCTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
            this.cthds.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }

        /**
         * Phương thức này xây dựng và trả về một đối tượng HoaDon dựa trên thông tin đã được thiết lập.
         *
         * @return Đối tượng HoaDon đã được xây dựng
         */
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
