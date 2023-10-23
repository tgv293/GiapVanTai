package B2_DecoratorPattern;

/**
 * Lớp TextProcessorDecorator là lớp trừu tượng decorator cho xử lý văn bản.
 */
public abstract class TextProcessorDecorator implements TextProcessor {
    protected TextProcessor decoratedTextProcessor;

    public TextProcessorDecorator(TextProcessor decoratedTextProcessor) {
        this.decoratedTextProcessor = decoratedTextProcessor;
    }

    public String process(String text) {
        return decoratedTextProcessor.process(text);
    }
}
