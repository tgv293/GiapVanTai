package CA6_Observer;

public class MainCA6 {
    public static void main(String[] args) {
        GameCharacter.Builder builder = new GameCharacter.Builder();

        builder.setRemainingTime(10)
                .setRemainingTurns(5)
                .setScore(100)
                .setLevel(1)
                .setBonus(50);

        GameCharacter character = builder.build();

        GameDashboard dashboard = new GameDashboard(character);

        character.update();

    }
}
