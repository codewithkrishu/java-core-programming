// Smartphone Class
class Smartphone {

    String brand;
    String model;
    double price;

    // Constructor to initialize all details
    Smartphone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Constructor Overloading
    // Initializes phone without a price
    Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    // Method to display smartphone details
    void showDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("-------------------------");
    }
}

// Main Class
public class SmartphoneConstructorOverloading {

    public static void main(String[] args) {

        // Object using first constructor
        Smartphone phone1 = new Smartphone("Samsung", "S21", 200000.0);

        // Object using overloaded constructor
        Smartphone phone2 = new Smartphone("Apple", "iPhone 15");

        // Display details
        phone1.showDetails();
        phone2.showDetails();
    }
}
