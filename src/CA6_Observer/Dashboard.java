package CA6_Observer;

public class Dashboard implements PlayerData.PlayerDataListener {

    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.addDashboard(this);
    }

    @Override
    public void update(PlayerData data) {
        System.out.println("\nTime: " + data.time);
        System.out.println("Countdown: " + data.countDown);
        System.out.println("Grade: " + data.grade);
    }
}
