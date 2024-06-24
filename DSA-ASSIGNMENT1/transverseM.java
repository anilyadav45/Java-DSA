public class transverseM {
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // function for transverse
    public static void transverse(int matrix[][]) {
        int row = 2;
        int col = 3;
        int transverse[][] = new int[col][row];
        // now assigning  transverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transverse[j][i] = matrix[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMatrix(matrix); // original
        transverse(matrix);
        printMatrix(matrix);

    }
}
