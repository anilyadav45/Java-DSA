public class holosquare {
    public static void holosqr(int Trows, int Tcol) {
        for (int i = 1; i <= Trows; i++) {
            System.out.println();
            for (int j = 1; j <= Tcol; j++) {
                if (i == 1 || i == Trows || j == 1 || j == Tcol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    public static void main(String[] args) {
        holosqr(4, 5);
    }
}
