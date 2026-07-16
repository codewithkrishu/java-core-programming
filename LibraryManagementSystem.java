// Book Class
class Book {

    String title;
    String author;
    boolean isAvailable = true;

    // Constructor to initialize book details
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Library Class
class Library {

    Book[] books = new Book[5];
    int count = 0;

    // Add a new book to the library
    void addBook(Book book) {
        books[count] = book;
        count++;
        System.out.println("Book added to library: " + book.title);
    }

    // Issue a book if available
    void issueBook(String bookTitle) {

        // Traverse all books in the library
        for (Book book : books) {

            // Check if the book exists
            if (book != null && book.title.equals(bookTitle)) {

                // Check availability
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("Book Issued: " + book.title);
                } else {
                    System.out.println("Sorry! Book is already issued.");
                }
                return;
            }
        }

        // Executes if the book is not found
        System.out.println("Book not found!");
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Creating Library object
        Library library = new Library();

        // Creating Book objects
        Book book1 = new Book("Java Basics", "Krishu");
        Book book2 = new Book("Python Master", "Anand");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Issuing books
        library.issueBook("Java Basics");
        library.issueBook("Java Basics");
    }
}
