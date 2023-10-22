package TemplateMethod;

public class Tea extends CaffeeinBeverage{
    @Override
    public void brew() {
        System.out.println("Ngâm túi lọc trà trong nước sôi 5 phút, sau đó lấy ra");
    }

    @Override
    public void addCondiment() {
        System.out.println("Thêm sữa ông Thọ ---> Trà sữa ông Thọ");
    }
}
