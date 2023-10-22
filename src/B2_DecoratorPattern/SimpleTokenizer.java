package B2_DecoratorPattern;

import java.util.*;

public class SimpleTokenizer implements Tokenizer {
    public List<String> tokenize(String text) {
        return new ArrayList<>(Arrays.asList(text.split(" ")));
    }
}
