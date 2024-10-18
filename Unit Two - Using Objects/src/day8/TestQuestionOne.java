package day8;



public class TestQuestionOne {
     public static void main(String[] args) {
        // 1. Create a Library
        Library cityLibrary = new Library("City Library");

        // 2. Create Books
        Book bookOne = new Book("Harry Potter", "J.K. Rowling");
        Book bookTwo = new Book("The Hobbit", "J.R.R. Tolkien");

        // 3. Add Books to the Library
        cityLibrary.addBook(bookOne);
        cityLibrary.addBook(bookTwo);

        // 4. Create a Member
        Member memberAlice = new Member("Alice", 101);

        // 5. Borrow a Book
        memberAlice.borrowBook(bookOne);

        // 6. Check Book Availability
        boolean isAvailable = bookOne.checkAvailability();
        System.out.println("Is 'Harry Potter' available? " + isAvailable);

        // 7. Return the Book
        memberAlice.returnBook(bookOne);

        // 8. List Available Books
        cityLibrary.listBooks();

        // 9. Check Total Books Borrowed by the Member
        int totalBorrowed = memberAlice.getBooksBorrowed();
        System.out.println("Total books borrowed by Alice: " + totalBorrowed);
    }
}



