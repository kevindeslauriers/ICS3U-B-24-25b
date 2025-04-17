package day4;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price){
        // implementation not shown
    }

    public String getTitle() {
        return title;
    }
    public String getBookInfo() {
        return title + "-" + price;
    }

    // There may be othe instance variables, constructors, and methods that are not shown.
}
