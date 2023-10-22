package TemplateMethod;

public abstract class CaffeeinBeverage {
    public abstract void brew();
    public abstract void addCondiment();
    public void prepareRecipe(){
        brew();
        pourInCups();
        addCondiment();
    }
    public void boilWater() {
        System.out.println("Đun sôi nước ở 100 độ C");
    }

    public void pourInCups() {
        System.out.println("Rót thức uống ra cốc");
    }
}
