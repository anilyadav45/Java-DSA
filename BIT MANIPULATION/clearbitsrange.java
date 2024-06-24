public class clearbitsrange {
    public static int toclearbitrange(int n, int i, int j) {
        int a = (~(0) << (j + i));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
     System.out.println(toclearbitrange(15, 2, 6));
    }
}
