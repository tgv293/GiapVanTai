package A5_BuilderPattern;

import java.util.List;

public class Book {
    private String title;
    private int pages;
    private String author;
    private List<String> chapters;

    private Book(Builder builder) {
        this.title = builder.title;
        this.pages = builder.pages;
        this.author = builder.author;
        this.chapters = builder.chapters;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Pages: " + pages + "\n" +
                "Author: " + author + "\n" +
                "Chapters: " + chapters + "\n";
    }

    public static class Builder {
        private String title;
        private int pages;
        private String author;
        private List<String> chapters;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setChapters(List<String> chapters) {
            this.chapters = chapters;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}