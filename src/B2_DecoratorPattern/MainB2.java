package B2_DecoratorPattern;

import java.util.Arrays;

public class MainB2 {
    public static void hienThi(String[] cacTu) {
        Arrays.stream(cacTu).forEach(s -> System.out.println(s));
    }
    public static void main(String[] args) {
        ITokenize tachTu = new TachTu("Bạn Quốc tưởng hôm nay Live Stream, nên ở nhà chờ coi và nghỉ học.");
//        hienThi(tachTu.tokenize());
//        System.out.println("Tách dấu câu");
//        ITokenize loaiBoDauCau = new LoaiBoDauCau(tachTu);
//        hienThi(loaiBoDauCau.tokenize());
        ITokenize loaiBoTuDung = new LoaiBoTuDung(tachTu);
        hienThi(loaiBoTuDung.tokenize());
    }
}
