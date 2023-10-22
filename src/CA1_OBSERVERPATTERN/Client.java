package CA1_OBSERVERPATTERN;

import java.util.ArrayList;
import java.util.List;

public class Client implements Stream.Listener {
    private List<String> courses = new ArrayList<>();
    private Stream stream;

    public Client(Stream stream) {
        this.stream = stream;
        stream.attach(this);
    }

    public void detach() {
        stream.detach(this);
    }

    @Override
    public void update(String oldCourse, String newCourse, String action) {
        switch (action) {
            case "ADD" -> courses.add(newCourse);
            case "UPDATE" -> {
                int index = courses.indexOf(oldCourse);
                if (index != -1) {
                    courses.set(index, newCourse);
                }
            }
            case "DELETE" -> courses.remove(oldCourse);
        }
        displayCourses();
    }

    private void displayCourses() {
        System.out.println("Courses: ");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
