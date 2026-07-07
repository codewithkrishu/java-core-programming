import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String reverse = "";

        // Taking input from user
        System.out.print("Enter Word: ");
        String str = sc.next().toUpperCase();

        // Reverse the given string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Compare original string with reversed string
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }

        sc.close();
    }
}
