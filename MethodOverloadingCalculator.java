// Calculator Class
class Calculator {

    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method Overloading: Add three numbers
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method Overloading: Add four numbers
    public double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    // Method Overloading: Add five numbers
    public double add(double a, double b, double c, double d, double e) {
        return a + b + c + d + e;
    }
}

// Main Class
public class MethodOverloadingCalculator {

    public static void main(String[] args) {

        // Creating Calculator object
        Calculator calculator = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 2 Numbers: " + calculator.add(10, 30));
        System.out.println("Sum of 3 Numbers: " + calculator.add(30, 10, 20));
        System.out.println("Sum of 4 Numbers: " + calculator.add(30, 10, 20, 5));
        System.out.println("Sum of 5 Numbers: " + calculator.add(30, 10, 20, 5, 7));
    }
}
