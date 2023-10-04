package A4_Singleton;

import singleton.vidu.MySingleton;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int Trump, Biden;
    private List<String> usersVoted;

    private Election() {
        Trump = 0;
        Biden = 0;
        usersVoted = new ArrayList<>();
    }

    public static Election getInstance() {
        if (instance == null)
            instance = new Election();
        return instance;
    }

    public void vote(Candidate c, String user) {
        if (!usersVoted.contains(user)) {
            if (c == Candidate.Trump) {
                Trump++;
            } else if (c == Candidate.Biden) {
                Biden++;
            }
            usersVoted.add(user);
        } else {
            System.out.println(user + " đã bỏ phiếu.");
        }
    }

    public void printVoters() {
        System.out.println("Danh sách người đã bỏ phiếu:");
        for (String user : usersVoted) {
            System.out.println(user);
        }
    }

    public int getTrump() {
        return Trump;
    }

    public int getBiden() {
        return Biden;
    }
}
