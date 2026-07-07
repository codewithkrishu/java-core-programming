public class DuplicateElementFinder {

    public static void main(String[] args) {

        // Array containing duplicate values
        int[] arr = {3, 1, 3, 2, 4, 2, 5, 4};

        // Outer loop -> Picks one element at a time
        for (int i = 0; i < arr.length; i++) {

            // Inner loop -> Compares the current element
            // with all remaining elements
            for (int j = i + 1; j < arr.length; j++) {

                // Check if duplicate is found
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Value Found: " + arr[i]);
                    return; // Stop the program after finding the first duplicate
                }
            }
        }

        // Executes only if no duplicate exists
        System.out.println("No Duplicate Value Found.");
    }
}
