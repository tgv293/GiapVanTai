package TemplateMethod;

public class Coffee extends CaffeeinBeverage{
    @Override
    public void brew() {
        System.out.println("Pha cà phê với nước sôi");
    }

    @Override
    public void addCondiment() {
        System.out.println("Thêm đường và sữa");
    }
}
