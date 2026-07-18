// Parent Class
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

    // Overloaded constructor (Price is set to 0.0 by default)
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

// Child Class
class GamingPhone extends Smartphone {

    int ram;

    // Constructor with price
    GamingPhone(String brand, String model, double price, int ram) {
        super(brand, model, price);
        this.ram = ram;
    }

    // Overloaded constructor (Default price = 0.0)
    GamingPhone(String brand, String model, int ram) {
        super(brand, model);
        this.ram = ram;
    }

    // Overriding the parent method
    @Override
    void showDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("RAM   : " + ram + " GB");
        System.out.println("-------------------------");
    }
}

// Main Class
public class GamingPhoneInheritance {

    public static void main(String[] args) {

        // Object using constructor with price
        GamingPhone gp1 = new GamingPhone("Asus", "ROG", 50000, 16);

        // Object using constructor with default price
        GamingPhone gp2 = new GamingPhone("Apple", "iPhone 17 Pro", 16);

        // Display details
        gp1.showDetails();
        gp2.showDetails();
    }
}
