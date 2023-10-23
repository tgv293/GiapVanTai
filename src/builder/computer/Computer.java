package builder.computer;

/**
 * Lớp Computer đại diện cho một máy tính với các thuộc tính như CPU, RAM, bộ nhớ và màn hình.
 */
public class Computer {
    String CPU, RAM, storage, screen;

    /**
     * Constructor của lớp Computer.
     *
     * @param builder Một đối tượng Builder để xây dựng máy tính.
     */
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

    /**
     * Lớp Builder giúp xây dựng máy tính bước-by-bước và trả về một đối tượng Computer đã được tạo.
     */
    public static class Builder {
        String CPU, RAM, storage, screen;

        /**
         * Phương thức này thêm thông tin CPU vào máy tính.
         *
         * @param CPU Thông tin về CPU.
         * @return Đối tượng Builder để cho phép gọi tiếp các phương thức khác.
         */
        public Builder addCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * Phương thức này thêm thông tin RAM vào máy tính.
         *
         * @param RAM Thông tin về RAM.
         * @return Đối tượng Builder để cho phép gọi tiếp các phương thức khác.
         */
        public Builder addRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        /**
         * Phương thức này thêm thông tin bộ nhớ vào máy tính.
         *
         * @param storage Thông tin về bộ nhớ.
         * @return Đối tượng Builder để cho phép gọi tiếp các phương thức khác.
         */
        public Builder addStorage(String storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Phương thức này thêm thông tin màn hình vào máy tính.
         *
         * @param screen Thông tin về màn hình.
         * @return Đối tượng Builder để cho phép gọi tiếp các phương thức khác.
         */
        public Builder addScreen(String screen) {
            this.screen = screen;
            return this;
        }

        /**
         * Phương thức này xây dựng và trả về một đối tượng Computer đã được tạo.
         *
         * @return Đối tượng Computer đã được xây dựng.
         */
        public Computer build() {
            return new Computer(this);
        }
    }
}
