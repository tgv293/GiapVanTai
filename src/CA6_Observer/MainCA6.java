package CA6_Observer;

public class MainCA6 {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(12,11, 10);
        Dashboard dashboard = new Dashboard(playerData);

        playerData.setGrade(5);
    }
}
