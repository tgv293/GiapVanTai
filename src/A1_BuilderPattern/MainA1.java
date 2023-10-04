package A1_BuilderPattern;

public class MainA1 {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHeader("HD01", "27/09/2023", "Nguyen Van A")
                .addCTHD("San pham 1", 10, 20000, 0.05)
                .addCTHD("San pham 2", 5, 50000, 0.1)
                .build();

        System.out.println(hoaDon);
    }
}

