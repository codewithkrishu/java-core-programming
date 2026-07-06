import java.util.Scanner;

public class MultiplicationTable {

    // Method to print multiplication table
    static void table(int n) {

        // Loop runs from 1 to 10
        // Prints the multiplication table of the given number
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Program Heading
        System.out.println("## MULTIPLICATION TABLE GENERATOR ##\n");

        // Taking input from user
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("--------------------");

        // Calling the table method
        table(number);

        System.out.println("--------------------");

        sc.close();
    }
}
