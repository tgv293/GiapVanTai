package CD2_TemplateMethod;

public class SinhVienDB extends EntityDB<SinhVien>{
    @Override
    protected int getId(SinhVien sinhVien) {
        return sinhVien.id;
    }
}
