package builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("Ultra core 1500K")
                .addRAM("Kingston Furry 64GB")
                .addStorage("2TB Samsung Evo NVMe")
                .addScreen("27 inch 8K LG 100% RGB")
                .build();
        System.out.println(computer.toString());
    }
}
