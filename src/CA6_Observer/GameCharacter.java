package CA6_Observer;

public class GameCharacter {
    int remainingTime;
    int remainingTurns;
    int score;
    int level;
    int bonus;
    GameObserver observer;

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

    public void attach(GameObserver observer) {
        this.observer = observer;
    }

    public void detach() {
        this.observer = null;
    }

    public void update() {
        if (observer != null) observer.update(this);
    }
    
    public int getRemainingTime() { return remainingTime; }
    public int getRemainingTurns() { return remainingTurns; }
    public int getScore() { return score; }
    public int getLevel() { return level; }
    public int getBonus() { return bonus; }

    public static interface GameObserver {
        void update(GameCharacter character);
    }
}