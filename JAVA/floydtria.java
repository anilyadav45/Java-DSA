public class floydtria {
    public static void floydtri(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            for (int k = i + 1; k <= n; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydtri(5);
    }

}
