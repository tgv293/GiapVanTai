package CC2_STRATERYPATTERN;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.diemTB > o2.diemTB)
            return 1;
        else if (o1.diemTB < o2.diemTB)
            return -1;
        else
            return 0;
    }
}
