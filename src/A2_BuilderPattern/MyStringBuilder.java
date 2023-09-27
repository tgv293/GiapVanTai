package A2_BuilderPattern;

public class MyStringBuilder {
    private StringBuilder str;

    public MyStringBuilder() {
        this.str = new StringBuilder();
    }

    public MyStringBuilder addString(String s) {
        str.append(s);
        return this;
    }

    public MyStringBuilder addFloat(float f) {
        str.append(f);
        return this;
    }

    public MyStringBuilder addBool(boolean b) {
        str.append(b);
        return this;
    }

    @Override
    public String toString() {
        return str.toString();
    }
}
