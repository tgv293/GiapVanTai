package Observer;

public class NhaDauTuB implements TiGia63.I_TheodoiTiGia {
    TiGia63 tiGia63;
    public NhaDauTuB(TiGia63 tiGia63){
        this.tiGia63 = tiGia63;
        tiGia63.attach(this);
    }
    public void huyDangKy(){
        tiGia63.detach(this);
    }

    @Override
    public void capNhat(float delta) {
        if(delta>0)
            System.out.println("Nhà đầu tư B: Bán ra");
        else
            System.out.println("Nhà đầu tư B: mua vào");
    }
}