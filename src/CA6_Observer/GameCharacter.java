package CA6_Observer;

/**
 * Lớp GameCharacter đại diện cho nhân vật trong trò chơi và là một phần của mô hình Observer.
 */
public class GameCharacter {
    int remainingTime;
    int remainingTurns;
    int score;
    int level;
    int bonus;
    GameObserver observer;

    /**
     * Lớp Builder giúp xây dựng một đối tượng GameCharacter dễ dàng với các thuộc tính tùy chỉnh.
     */
    public static class Builder {
        int remainingTime;
        int remainingTurns;
        int score;
        int level;
        int bonus;

        public Builder setRemainingTime(int remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }

        public Builder setRemainingTurns(int remainingTurns) {
            this.remainingTurns = remainingTurns;
            return this;
        }

        public Builder setScore(int score) {
            this.score = score;
            return this;
        }

        public Builder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Builder setBonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        /**
         * Phương thức này tạo và trả về một đối tượng GameCharacter dựa trên các thuộc tính được thiết lập.
         *
         * @return Đối tượng GameCharacter mới được xây dựng.
         */
        public GameCharacter build() {
            GameCharacter character = new GameCharacter();
            character.remainingTime = this.remainingTime;
            character.remainingTurns = this.remainingTurns;
            character.score = this.score;
            character.level = this.level;
            character.bonus = this.bonus;
            return character;
        }
    }

    /**
     * Phương thức này đăng ký một người theo dõi (Observer) cho nhân vật.
     *
     * @param observer Người theo dõi (Observer) cần được đăng ký.
     */
    public void attach(GameObserver observer) {
        this.observer = observer;
    }

    /**
     * Phương thức này hủy đăng ký người theo dõi (Observer) cho nhân vật.
     */
    public void detach() {
        this.observer = null;
    }

    /**
     * Phương thức này thông báo cho người theo dõi (Observer) về các thay đổi trong nhân vật.
     */
    public void update() {
        if (observer != null) observer.update(this);
    }

    public int getRemainingTime() { return remainingTime; }
    public int getRemainingTurns() { return remainingTurns; }
    public int getScore() { return score; }
    public int getLevel() { return level; }
    public int getBonus() { return bonus; }

    /**
     * Giao diện GameObserver đại diện cho một người theo dõi (Observer) của GameCharacter.
     */
    public static interface GameObserver {
        void update(GameCharacter character);
    }
}
