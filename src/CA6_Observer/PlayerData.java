package CA6_Observer;

public class PlayerData {
    int time, countDown, grade;
    PlayerDataListener dashboard;

    public PlayerData(int time, int countDown, int grade) {
        this.time = time;
        this.countDown = countDown;
        this.grade = grade;
    }

    public void addDashboard(PlayerDataListener playerDataListener) {
        dashboard = playerDataListener;
        playerDataListener.update(this);
    }

    public void setTime(int time) {
        this.time = time;
        dashboard.update(this);
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        dashboard.update(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashboard.update(this);
    }

    public static interface PlayerDataListener {
        void update(PlayerData data);
    }
}
