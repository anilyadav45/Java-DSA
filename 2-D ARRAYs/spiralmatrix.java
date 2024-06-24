public class spiralmatrix {
    public static void printspiral(int matrix[][]) {
        int startR = 0;
        int startC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;

        while (startR <= endR && startC <= endC) {
            // For Top boundary
            for (int i = startC; i <= endC; i++) {
                System.out.print(matrix[startR][i] + " ");
            }
            // for Right side boundary
            for (int i = startR + 1; i <= endR; i++) {
                System.out.print(matrix[i][endC] + " ");
            }
            // for bottom boundary
            for (int i = endC - 1; i >= startC; i--) {
                // for when only one element becomes remaining and we have to print all top
                // right bottom and left this condition help it to not run the same values
                // jo top me hogya wo bottom me na ho and jo right me hogya wo left me naho SO,
                if (startR == endR) { // if already printed in top
                    break;
                }
                System.out.print(matrix[endR][i] + " ");
            }
            // for left boundary
            for (int i = endR - 1; i >= startR + 1; i--) {
                if (startC == endC) { // if already printed right
                    break;
                }
                System.out.print(matrix[i][startC] + " ");
            }
            // for run conditon in between matrix we must icre and dec
            startR++;
            startC++;
            endR--;
            endC--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } };
        printspiral(matrix);

    }
}
