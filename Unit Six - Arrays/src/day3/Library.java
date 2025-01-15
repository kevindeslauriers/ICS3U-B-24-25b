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

    public void displayBooks() {
        // for (Book book : books) {
        // if (book != null)
        // System.out.println(book);
        // }

        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public void displayAvailableBooks() {
        // for (Book book : books) {
        // if (book != null && !book.isBorrowed())
        // System.out.println(book);
        // }

        for (int i = 0; i < numBooks; i++) {
            if (!books[i].isBorrowed())
                System.out.println(books[i]);
        }
    }

    public Book borrowBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title) && !books[i].isBorrowed()) {
                books[i].setBorrowed(true);
                return books[i];
            } 
        }
        System.out.println("Unable to borrow book.");
        return null;
    }
}
