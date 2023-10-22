package CA6_Observer;

public class GameDashboard implements GameCharacter.GameObserver {

    GameCharacter gameCharacter;

    public GameDashboard(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
        gameCharacter.attach(this);
    }

    @Override
    public void update(GameCharacter character) {
        System.out.println("Thời gian còn lại: " + character.getRemainingTime());
        System.out.println("Số lượt chơi còn lại: " + character.getRemainingTurns());
        System.out.println("Điểm số đạt được: " + character.getScore());
        System.out.println("Level hiện tại: " + character.getLevel());
        System.out.println("Thưởng bổ sung: " + character.getBonus());
    }
}
