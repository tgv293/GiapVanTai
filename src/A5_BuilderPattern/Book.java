package A5_BuilderPattern;

import java.util.*;

public class Book {
    private String title;       // Tiêu đề của cuốn sách
    private int pages;          // Số trang của cuốn sách
    private String author;      // Tên tác giả của cuốn sách
    private List<String> chapters; // Danh sách các chương của cuốn sách

    /**
     * Constructor ẩn định được sử dụng bởi lớp Builder để xây dựng một cuốn sách.
     */
    private Book(Builder builder) {
        this.title = builder.title;
        this.pages = builder.pages;
        this.author = builder.author;
        this.chapters = builder.chapters;
    }

    /**
     * Phương thức toString() để trả về một chuỗi mô tả về cuốn sách.
     */
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Pages: " + pages + "\n" +
                "Author: " + author + "\n" +
                "Chapters: " + chapters + "\n";
    }

    /**
     * Lớp Builder cho phép xây dựng một cuốn sách bước bước với các thuộc tính tùy chọn.
     */
    public static class Builder {
        private String title;       // Tiêu đề của cuốn sách
        private int pages;          // Số trang của cuốn sách
        private String author;      // Tên tác giả của cuốn sách
        private List<String> chapters; // Danh sách các chương của cuốn sách

        /**
         * Phương thức này thiết lập tiêu đề của cuốn sách.
         *
         * @param title Tiêu đề của cuốn sách
         * @return Thể hiện của lớp Builder để tiếp tục xây dựng
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Phương thức này thiết lập số trang của cuốn sách.
         *
         * @param pages Số trang của cuốn sách
         * @return Thể hiện của lớp Builder để tiếp tục xây dựng
         */
        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        /**
         * Phương thức này thiết lập tên tác giả của cuốn sách.
         *
         * @param author Tên tác giả của cuốn sách
         * @return Thể hiện của lớp Builder để tiếp tục xây dựng
         */
        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        /**
         * Phương thức này thiết lập danh sách các chương của cuốn sách.
         *
         * @param chapters Danh sách các chương của cuốn sách
         * @return Thể hiện của lớp Builder để tiếp tục xây dựng
         */
        public Builder setChapters(List<String> chapters) {
            this.chapters = chapters;
            return this;
        }

        /**
         * Phương thức này tạo một cuốn sách sử dụng thông tin đã được thiết lập trong lớp Builder.
         *
         * @return Thể hiện của lớp Book đã được xây dựng
         */
        public Book build() {
            return new Book(this);
        }
    }
}
