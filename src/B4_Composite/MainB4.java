package B4_Composite;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachChung khoaHoc = new KeHoachChung("2020-2024");

        String[] monHocNames = {"Toán", "Vật lý", "Hóa học", "Sinh học", "Tiếng Anh", "Lịch sử", "Địa lý", "GDCD"};
        int[] soTCs = {3, 4, 3, 3, 2, 2, 2, 2};
        int[] hocPhis = {1000, 1500, 1200, 1200, 800, 800, 800, 800};

        int index = 0;

        for (int i = 1; i <= 2; i++) {
            KeHoachChung namHoc = new KeHoachChung("Năm " + i);
            for (int j = 1; j <= 2; j++) {
                KeHoachChung kyHoc = new KeHoachChung("Kỳ " + j);
                for (int k = 1; k <= 2; k++) {
                    MonHoc monHoc = new MonHoc(monHocNames[index], soTCs[index], hocPhis[index]);
                    kyHoc.Add(monHoc);
                    index++;
                }
                namHoc.Add(kyHoc);
            }
            khoaHoc.Add(namHoc);
            System.out.println(namHoc.name + ":");
            System.out.println("\tTổng số tín chỉ: " + namHoc.getSoTC());
            System.out.println("\tTổng học phí: " + namHoc.getHocPhi());
        }

        System.out.println("Tổng số tín chỉ của khóa học: " + khoaHoc.getSoTC());
        System.out.println("Tổng học phí của khóa học: " + khoaHoc.getHocPhi());
    }
}
