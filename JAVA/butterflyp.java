public class butterflyp {
    public static void butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = i + 1; k <= n; k++) {
                System.out.print("  ");
            }
            // dfdfdfrerfrerfsfrsffdsfgrf rrferferre445454

            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // for fulll butterfly
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            for (int k = n - i + 2; k <= n; k++) {
                System.out.print("  ");
            }
            // dfdfdfrerfrerfsfrsffdsfgrf rrferferre445454
            // System.out.println();
            for (int k = n - i + 2; k <= n; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly_pattern(5);
    }
}
