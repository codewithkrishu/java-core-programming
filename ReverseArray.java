import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask array size from user
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Take array elements from user
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        int len = arr.length;
        int half = len / 2;

        for (int i = 0; i < half; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
