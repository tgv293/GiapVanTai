package B2_DecoratorPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class LoaiBoTuDung extends TokenDecorator {

    String[] dsTuDung = new String[]{"và", "hoặc", "thì", "mà", "là"};

    public LoaiBoTuDung(ITokenize tokenize) {
        super(tokenize);
    }

    @Override
    public String[] tokenize() {
        ArrayList<String> dsTu = new ArrayList<>();
        dsTu.addAll(Arrays.asList(super.tokenize()));
        dsTu.removeAll(Arrays.asList(dsTuDung));
        return dsTu.toArray(new String[0]);
    }
}
