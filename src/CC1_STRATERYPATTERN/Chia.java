package CC1_STRATERYPATTERN;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b) {
        if(b != 0)
            return a / b;
        else return Float.NaN;
    }
}
