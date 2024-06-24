public class dectobin {
    public static void decitobino(int n) {
        int rem = 0;
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            rem = n % 2;
            // below code for changing positon of ones tens hundreds likewise
            bin = bin + (rem * (int) Math.pow(10, pow));
            n /= 2;
            pow++;
        }
        System.out.print(bin);
    }

    public static void main(String[] args) {
        decitobino(17);
    }
}
