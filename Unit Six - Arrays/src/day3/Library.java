package day3;

public class Library {
    // Attributes
    private Book[] books; // Array to hold books
    private int numBooks; // Number of books currently in the library

    // Constructor accepting the size of the library
    public Library(int size) {
        books = new Book[size]; // Initialize the array with the given size
        numBooks = 0; // Initially, the library has no books
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        // Ensure that there is space in the array
        if (numBooks < books.length) {
            books[numBooks] = book; // Add the book to the current position
            numBooks++; // Increment the number of books
        } else {
            System.out.println("No space available in the library to add more books.");
        }
    }

    // Stub for displayBooks method (no body)
    public void displayBooks() {
        // Method body will be created later
    }

    // Stub for borrowBook method (no body)
    public void borrowBook(String title) {
        // Method body will be created later
    }
}

