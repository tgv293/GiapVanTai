package B2_DecoratorPattern;

import java.util.*;

class StopWordRemover extends TokenizerDecorator {
    public StopWordRemover(Tokenizer tokenizer) {
        super(tokenizer);
    }

    public List<String> tokenize(String text) {
        List<String> tokens = tokenizer.tokenize(text);
        tokens.removeAll(Arrays.asList("và", "hoặc", "thì", "mà", "là"));
        return tokens;
    }
}
