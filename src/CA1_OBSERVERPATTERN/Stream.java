package CA1_OBSERVERPATTERN;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    private static Stream instance;
    private List<Listener> listeners = new ArrayList<>();
    private List<String> data = new ArrayList<>();

    private Stream() {}

    public static Stream getInstance() {
        if (instance == null) {
            instance = new Stream();
        }
        return instance;
    }

    public void attach(Listener listener) {
        if(!listeners.contains(listener))
            listeners.add(listener);
    }

    public void detach(Listener listener) {
        if(listeners.contains(listener))
            listeners.remove(listener);
    }

    void addEvent(String t) {
        data.add(t);
        for (Listener listener : listeners) {
            listener.update(null, t, "ADD");
        }
    }

    void updateEvent(String oldEvent, String newEvent) {
        int index = data.indexOf(oldEvent);
        if (index != -1) {
            data.set(index, newEvent);
            for (Listener listener : listeners) {
                listener.update(oldEvent, newEvent, "UPDATE");
            }
        }
    }

    void deleteEvent(String t) {
        data.remove(t);
        for (Listener listener : listeners) {
            listener.update(t, null, "DELETE");
        }
    }

    public static interface Listener {
        void update(String oldEvent, String newEvent, String action);
    }
}
