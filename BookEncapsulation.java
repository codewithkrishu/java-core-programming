// Book Class
class Book {

    // Private data members (Encapsulation)
    private String title;
    private double price;

    // Setter method to set book price
    public void setPrice(double price) {

        // Validate price before assigning
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price!");
        }
    }

    // Getter method to return book price
    public double getPrice() {
        return price;
    }

    // Setter method to set book title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method to return book title
    public String getTitle() {
        return title;
    }
}

// Main Class
public class BookEncapsulation {

    public static void main(String[] args) {

        // Creating Book object
        Book myBook = new Book();

        // Setting book details using setter methods
        myBook.setTitle("The Krishu");
        myBook.setPrice(200);

        // Displaying book details using getter methods
        System.out.println("Book Title : " + myBook.getTitle());
        System.out.println("Book Price : " + myBook.getPrice());
    }
}
