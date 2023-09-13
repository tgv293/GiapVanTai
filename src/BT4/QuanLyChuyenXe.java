package BT4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsCX = new ArrayList<>();

    public void them(ChuyenXe cx) {
        dsCX.add(cx);
    }

    public void inDS() {
        for (ChuyenXe cx: dsCX) {
            System.out.println(cx.toString());
        }
    }

    public int doanhThuXeNoiThanh(){
        int tong = 0;
        for (ChuyenXe cx : dsCX){
            if (cx instanceof ChuyenXeNoiThanh){
                tong += cx.doanhThu;
            }
        }
        return tong;
    }
    public int doanhThuXeNgoaiThanh(){
        int tong = 0;
        for (ChuyenXe cx : dsCX){
            if (cx instanceof ChuyenXeNgoaiThanh){
                tong += cx.doanhThu;
            }
        }
        return tong;
    }
    public int tongDoanhThu(){
        return doanhThuXeNgoaiThanh() + doanhThuXeNoiThanh();
    }

}
