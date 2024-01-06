package B2_DecoratorPattern;

public abstract class TokenDecorator implements ITokenize {
    protected ITokenize tokenize;

    public TokenDecorator(ITokenize tokenize) {
        this.tokenize = tokenize;
    }

    public String[] tokenize() {
        return tokenize.tokenize();
    }
}
