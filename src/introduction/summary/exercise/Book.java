package introduction.summary.exercise;

public class Book {
    private String title;
    private String author;
    private int pages = 1;

    public Book() {
    }

    public Book(String title, String author, int pages) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            System.out.println("Gabim! Nuk ka titull!");
            return;
        }
        if (title.length() > 100) {
            System.out.println("Gabim! Titulli eshte shume i gjate!");
            return;
        }
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages < 1) {
            System.out.println("Gabim! Nuk ka faqe!");
            return;
        }
        this.pages = pages;
    }

    public boolean isLong() {
        return pages > 300;
    }

    public String toString() {
        return String.format("Title: %s, Author: %s, Pages: %d, Long: %b", title, author, pages, isLong());
    }
}
