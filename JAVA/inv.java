public class inv {
    public static void invertedfuk(int Trow, int Tcol) {
        for (int i = 1; i <= Trow; i++) {
            for (int j = 1; j <= Tcol; j++) {
                if (j + i <= Tcol) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                // I can aslo make using two loops one for starts and another for spaces
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedfuk(10, 10);
    }
}
