package B2_DecoratorPattern;

import java.util.List;
import java.util.Arrays;

public class LoaiBoDauCau extends TokenDecorator {

    List<Character> dauCau = Arrays.asList('[','.',',',';',':','!','?',']');
    public LoaiBoDauCau(ITokenize tokenize) {
        super(tokenize);
    }

    @Override
    public String[] tokenize() {
        String[] cacTu = super.tokenize();

        for(int i = 0; i < cacTu.length; i++) {
            if(dauCau.contains(cacTu[i].toCharArray()[cacTu[i].length()-1])) {
                cacTu[i] = cacTu[i].substring(0,cacTu[i].length()-1);
            }
        }
        return cacTu;
    }
}
