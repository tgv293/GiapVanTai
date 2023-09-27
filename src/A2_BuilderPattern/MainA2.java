package A2_BuilderPattern;

public class MainA2 {
    public static void main(String[] args) {
        MyStringBuilder myStrBuilder = new MyStringBuilder();
        myStrBuilder.addString("Hello, ").addString("World! ").addFloat(1.23f).addBool(true);
        System.out.println(myStrBuilder.toString());
    }
}
