package A5_BuilderPattern;

import java.util.*;

public class MainA5 {
    public static void main(String[] args) {
        // Tạo danh sách các chương cho cuốn sách.
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        // Sử dụng lớp Builder để xây dựng cuốn sách bước by bước.
        Book book = new Book.Builder()
                .setTitle("My Book")
                .setPages(200)
                .setAuthor("John Doe")
                .setChapters(chapters)
                .build();

        // In thông tin về cuốn sách đã xây dựng.
        System.out.print(book);
    }
}
