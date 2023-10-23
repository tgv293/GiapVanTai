package CA1_OBSERVERPATTERN;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Client đại diện cho một khách hàng sử dụng luồng dữ liệu và là một thành phần của mô hình Observer.
 */
public class Client implements Stream.Listener {
    private List<String> courses = new ArrayList<>();
    private Stream stream;

    /**
     * Khởi tạo một đối tượng Client và đăng ký nó cho việc theo dõi luồng dữ liệu từ Stream.
     *
     * @param stream Stream để theo dõi.
     */
    public Client(Stream stream) {
        this.stream = stream;
        stream.attach(this);
    }

    /**
     * Tách Client ra khỏi việc theo dõi luồng dữ liệu.
     */
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

    /**
     * Hiển thị danh sách các khóa học đang được theo dõi bởi Client.
     */
    private void displayCourses() {
        System.out.println("Courses: ");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
