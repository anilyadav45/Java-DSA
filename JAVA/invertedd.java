public class invertedd {
    public static void invertedfuk(int Trow, int Tcol) {
        for (int i = 1; i <= Trow; i++) {
            for (int j = 1; j <= Tcol; j++) {
                if (j + i <= Tcol) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
