package factory.pizza;

public class VN_PizzaSeafood extends Pizza {
    @Override
    public void prepare() {
        builder.append("Bột gạo, Tôm, Mực, Nước mắm");
    }

    @Override
    public void bake() {
        builder.append("\nNướng trên lửa than");
    }

    @Override
    public void cut() {
        builder.append("\nCắt làm 4");
    }

    @Override
    public void box() {
        builder.append("\nĐóng hộp lá chuối\nChúc quý khách ngon miệng, hẹn gặp lại!");
    }
}

