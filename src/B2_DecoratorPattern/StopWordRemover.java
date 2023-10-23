package B2_DecoratorPattern;

/**
 * Lớp StopWordRemover là một decorator để loại bỏ từ dừng khỏi văn bản.
 */
public class StopWordRemover extends TextProcessorDecorator {
    private static final String[] STOP_WORDS = {" và ", " hoặc ", " thì ", " mà ", " là "};

    public StopWordRemover(TextProcessor decoratedTextProcessor) {
        super(decoratedTextProcessor);
    }

    /**
     * Loại bỏ từ dừng từ văn bản.
     *
     * @param text Văn bản đầu vào
     * @return Văn bản sau khi loại bỏ từ dừng
     */
    public String process(String text) {
        text = " " + super.process(text) + " ";
        for (String stopWord : STOP_WORDS) {
            text = text.replace(stopWord, " ");
        }
        text = text.replaceAll("\\s+", " ");
        return text.trim();
    }
}
