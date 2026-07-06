import java.util.Scanner;

public class Factorial {

    // Method to calculate factorial
    static int factorial(int n) {

        // Check for invalid input
        if (n < 0) {
            System.out.println("Invalid Number!");
            return -1;
        }

        int fact = 1;

        // Loop runs from 1 to n
        // Multiplies each number with the current factorial value
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // Return the calculated factorial
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Calling factorial method
        int result = factorial(n);

        // Print result only if input is valid
        if (result != -1) {
            System.out.println("Factorial of " + n + " is: " + result);
        }

        sc.close();
    }
}
