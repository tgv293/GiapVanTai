package B2_DecoratorPattern;

/**
 * Lớp MainB2 là lớp chứa phương thức main để thực hiện ví dụ minh họa sử dụng mô hình Decorator.
 * Trong ví dụ này, chúng ta sử dụng các decorator để xử lý văn bản và thực hiện các nhiệm vụ như tách từ, loại bỏ từ dừng, và loại bỏ dấu câu.
 */
public class MainB2 {
    public static void main(String[] args) {
        TextProcessor processor = new Tokenizer();
        String noiDungCau = "Tao hoặc mày đi tu tu.";
        String vanBanDaTachTu = processor.process(noiDungCau);
        System.out.println("Văn bản đã tách từ: " + vanBanDaTachTu);

        processor = new StopWordRemover(new Tokenizer());
        String vanBanKhongCoTuDung = processor.process(noiDungCau);
        System.out.println("Văn bản không có từ dừng: " + vanBanKhongCoTuDung);

        processor = new PunctuationRemover(new Tokenizer());
        String vanBanKhongCoDauCau = processor.process(noiDungCau);
        System.out.println("Văn bản không có dấu câu: " + vanBanKhongCoDauCau);

        processor = new PunctuationRemover(new StopWordRemover(new Tokenizer()));
        String vanBanDaXuLyHoanTat = processor.process(noiDungCau);
        System.out.println("Văn bản đã xử lý hoàn tất: " + vanBanDaXuLyHoanTat);
    }
}
