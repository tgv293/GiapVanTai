package B2_DecoratorPattern;

/**
 * Lớp Tokenizer thực hiện việc tách văn bản thành các từ riêng lẻ.
 */
public class Tokenizer implements TextProcessor {
    public String process(String text) {
        String[] words = text.split(" ");
        String tokenizedText = "";
        for (String word : words) {
            tokenizedText += word + " ";
        }
        return tokenizedText.trim();
    }
}
