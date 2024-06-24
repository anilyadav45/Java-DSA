import java.util.Scanner;

public class takingmatrix {
    public static void printmatrix() {
        int matrix[][] = new int[3][3];
        // taking matrix from user
        int m = 3, n = 3;
        Scanner sc = new Scanner(System.in);
        // taking elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // printing matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // called searching function for search elements
        searchelement(matrix, 5);
    }

    // searching elements in matrix :
    public static boolean searchelement(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("( " + i + ", " + j + " )");
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        printmatrix();
    }
}