import java.util.Scanner;

public class VowelAndConsonantCounter {

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase for easy comparison
        str = str.toLowerCase();

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if the character is an alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check whether the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    // If not a vowel, then it is a consonant
                    consonants++;
                }
            }
        }

        // Display the result
        System.out.println("Vowel Count      : " + vowels);
        System.out.println("Consonant Count : " + consonants);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        // Call the method
        countVowelsAndConsonants(str);

        sc.close();
    }
}
