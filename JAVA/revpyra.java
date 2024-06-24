public class revpyra {
        public static void rev_pyr(int n) {
            for (int i = 0; i < n; i++) {
                // for numbers
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(j + " ");
                }
                for (int k = n - i; k < n; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } 
    public static void main(String[] args) {
        rev_pyr(5);
    }
}
