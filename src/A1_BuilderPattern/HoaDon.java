package A1_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader header;
    private List<CTHD> cthds;

    protected HoaDon(Builder builder) {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        for (CTHD cthd : cthds) {
            builder.append("\n").append(cthd.toString());
        }
        return builder.toString();
    }

    public static class Builder {
        private HoaDonHeader header;
        private List<CTHD> cthds = new ArrayList<>();

        public Builder setHeader(String maHD, String ngayBan, String tenKH) {
            this.header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }

        public Builder addCTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
            this.cthds.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }

    }
}