package B2_DecoratorPattern;

/**
 * Lớp PunctuationRemover là một decorator để loại bỏ dấu câu khỏi văn bản.
 */
public class PunctuationRemover extends TextProcessorDecorator {
    public PunctuationRemover(TextProcessor decoratedTextProcessor) {
        super(decoratedTextProcessor);
    }

    /**
     * Loại bỏ dấu câu từ văn bản.
     *
     * @param text Văn bản đầu vào
     * @return Văn bản sau khi loại bỏ dấu câu
     */
    public String process(String text) {
        text = super.process(text);
        return text.replaceAll("[.,;:!?]", "");
    }
}
