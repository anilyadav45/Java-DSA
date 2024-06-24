public class zeroone {
    public static void zeroone(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == 1) {
                    System.out.print(count + " ");
                    count--;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroone(5);
    }
}
