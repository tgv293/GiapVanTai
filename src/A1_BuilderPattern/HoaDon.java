package A1_BuilderPattern;

import A1_BuilderPattern.CTHD;

import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CTHD> dsCTHD;

    protected HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.dsCTHD = builder.dsCTHD;
    }

    public static class Builder {
        private HoaDonHeader hoaDonHeader;
        private List<CTHD> dsCTHD;

        public Builder setHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder setDsCTHD(List<CTHD> dsCTHD) {
            this.dsCTHD = dsCTHD;
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hoa Don:\n");
        builder.append("Ma Hoa Don: ").append(hoaDonHeader.getMaHoaDon()).append("\n");
        builder.append("Ngay Ban: ").append(hoaDonHeader.getNgayBan()).append("\n");
        builder.append("Ten Khach Hang: ").append(hoaDonHeader.getTenKhachHang()).append("\n");
        builder.append("Chi Tiet Hoa Don:\n");
        for (CTHD cthd : dsCTHD) {
            builder.append("San Pham: ").append(cthd.getSanPham()).append("\n");
            builder.append("So Luong: ").append(cthd.getSoLuong()).append("\n");
            builder.append("Don Gia: ").append(cthd.getDonGia()).append("\n");
            builder.append("Chiet Khau: ").append(cthd.getChietKhau()).append("\n");
        }
        return builder.toString();
    }

}