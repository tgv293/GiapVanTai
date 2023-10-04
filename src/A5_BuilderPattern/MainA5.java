package A5_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MainA5 {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        Book book = new Book.Builder()
                .setTitle("My Book")
                .setPages(200)
                .setAuthor("John Doe")
                .setChapters(chapters)
                .build();

        System.out.print(book);
    }
}
