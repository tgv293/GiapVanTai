package builder.computer;

public class Computer {
    String CPU, RAM, storage, screen;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static class Builder {
        String CPU, RAM, storage, screen;

        public Builder addCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder addRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder addStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder addScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
