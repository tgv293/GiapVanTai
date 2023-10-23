package CA6_Observer;

/**
 * Lớp GameDashboard đại diện cho bảng điều khiển trò chơi và là một phần của mô hình Observer.
 */
public class GameDashboard implements GameCharacter.GameObserver {

    GameCharacter gameCharacter;

    /**
     * Constructor khởi tạo một bảng điều khiển trò chơi và đăng ký nó làm người theo dõi (Observer) của một GameCharacter cụ thể.
     *
     * @param gameCharacter GameCharacter mà bảng điều khiển đang theo dõi.
     */
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
