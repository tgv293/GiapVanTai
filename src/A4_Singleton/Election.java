package A4_Singleton;

import java.util.HashMap;
import java.util.Map;

public class Election {
    private static Election instance;
    private Map<String, Integer> votes;
    private Map<String, Boolean> voters;

    private Election() {
        votes = new HashMap<>();
        votes.put("Donald Trump", 0);
        votes.put("Joe Biden", 0);
        voters = new HashMap<>();
    }

    public static synchronized Election getInstance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public boolean vote(String voter, String candidate) {
        if (voters.getOrDefault(voter, false)) {
            return false; // This voter has already voted
        }
        voters.put(voter, true);
        votes.put(candidate, votes.get(candidate) + 1);
        return true;
    }

    public int getVotes(String candidate) {
        return votes.get(candidate);
    }
}