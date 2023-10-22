package B2_DecoratorPattern;

public class MainB2 {
    public static void main(String[] args) {
        Tokenizer tokenizer = new SimpleTokenizer();
        tokenizer = new StopWordRemover(tokenizer);
        tokenizer = new PunctuationRemover(tokenizer);

        System.out.println(tokenizer.tokenize("Đây là một câu ví dụ, và nó có chứa các từ dừng và dấu câu."));
    }
}
