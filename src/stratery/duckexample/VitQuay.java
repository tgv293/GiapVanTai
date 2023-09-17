package stratery.duckexample;

public class VitQuay extends Duck{

    @Override
    public void display() {
        System.out.println("Vịt quay Bắc Ninh");
        this.swim();
        this.performQuack();
        this.performFly();
    }
}
