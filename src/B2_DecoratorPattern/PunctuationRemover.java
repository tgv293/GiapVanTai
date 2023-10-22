package B2_DecoratorPattern;

import java.util.*;

class PunctuationRemover extends TokenizerDecorator {
    public PunctuationRemover(Tokenizer tokenizer) {
        super(tokenizer);
    }

    public List<String> tokenize(String text) {
        text = text.replaceAll("\\p{Punct}", "");
        return tokenizer.tokenize(text);
    }
}
