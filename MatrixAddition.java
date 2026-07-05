public class MatrixAddition {
    public static void main(String[] args) {

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] mat2 = {
                {2, 4, 6},
                {3, 4, 2}
        };

        int[][] result = {
                {0, 0, 0},
                {0, 0, 0}
        };

        // Matrix Addition Logic

        // Outer loop -> Runs for each row
        for (int i = 0; i < mat1.length; i++) {

            // Inner loop -> Runs for each column of the current row
            for (int j = 0; j < mat1[i].length; j++) {

                // Adding corresponding elements of both matrices
                System.out.format("Setting value for i=%d and j=%d%n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the Result Matrix

        // Outer loop -> Moves row by row
        for (int i = 0; i < result.length; i++) {

            // Inner loop -> Prints every element of the current row
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }

            // Move to the next line after one row is printed
            System.out.println();
        }
    }
}
