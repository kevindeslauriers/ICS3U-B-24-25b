package day3;

public class Book {
    // Attributes
    private String author;
    private String title;
    private boolean isBorrowed;

    // Constructor with title and author, isBorrowed defaults to false
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // By default, the book is not borrowed
    }

    // Getter methods
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setter methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    // toString method to provide a string representation of the Book object
    public String toString() {
        return "Book Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Is Borrowed: " + isBorrowed;
    }
}
