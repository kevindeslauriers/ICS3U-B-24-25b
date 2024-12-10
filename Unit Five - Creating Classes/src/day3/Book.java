package day3;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = 2000;
        this.price = 0.99;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown Author";
        this.yearPublished = 2000;
        this.price = 0.99;
    }

    public void displayDetails(){
        String details = "Title: " + title + " Author: " + author + " Year Published: " + yearPublished + " Price: " + price;
        System.out.println(details);
    }

    public void displayDetails(boolean showTitleAndAuthorOnly){
        if (showTitleAndAuthorOnly){
            String details = "Title: " + title + " Author: " + author;
            System.out.println(details);
        }else{
            displayDetails();
        }
    }

    public void displayDetails(String showTitleOnly){
        if (showTitleOnly.equals("title")){
            System.out.println("Title: " + title);
        }else{
            displayDetails();
        }
    }


}
