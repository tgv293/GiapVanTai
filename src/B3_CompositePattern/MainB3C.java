package B3_CompositePattern;

/**
 * Lớp MainB3C thực hiện ví dụ về mô hình Composite trong việc quản lý thư mục và tệp tin.
 */
public class MainB3C {
    public static void main(String[] args) {
        Folder root = new Folder("Data (D:)", "10-10-2023");

        Folder taiLieu = new Folder("TaiLieu", "02-10-2023");
        root.addItem(taiLieu);

        Folder designPattern = new Folder("\tDesign Pattern", "03-10-2023");
        taiLieu.addItem(designPattern);
        designPattern.addItem(new File("\t\tCreationalPattern.pptx", "04-10-2023"));
        designPattern.addItem(new File("\t\tStructuralPattern.pptx", "05-10-2023"));

        Folder lapTrinhJava = new Folder("\tLap Trinh Java", "06-10-2023");
        taiLieu.addItem(lapTrinhJava);
        lapTrinhJava.addItem(new File("\t\tLapTrinhJavaNangCao.pdf", "08-10-2023"));

        taiLieu.addItem(new File("\tNgonNguLapTrinhC.pdf", "09-10-2023"));

        Folder lapTrinhThietBiDiDong = new Folder("\tLapTrinhThietBiDiDong", "10-10-2023");
        taiLieu.addItem(lapTrinhThietBiDiDong);
        lapTrinhThietBiDiDong.addItem(new File("\t\tCoBan.pptx", "11-10-2023"));
        lapTrinhThietBiDiDong.addItem(new File("\t\tNangCao.pptx", "12-10-2023"));

        System.out.println(root.getStringTreeFolder());

        System.out.println("In cây thư mục toán:");
        System.out.println(lapTrinhThietBiDiDong.getStringTreeFolder());
        System.out.println(lapTrinhThietBiDiDong.getDuongDan());
    }
}
