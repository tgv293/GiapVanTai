package B2_DecoratorPattern;

import java.util.*;

abstract class TokenizerDecorator implements Tokenizer {
    protected Tokenizer tokenizer;

    public TokenizerDecorator(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public abstract List<String> tokenize(String text);
}