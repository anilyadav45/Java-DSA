public class update {
    public static int clearith(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int updateithbit(int n, int i, int newBit) {
        n = clearith(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;
        // OR
        // if (newBit == 0) {
        //     return clearith(n, i); 
        // } else {
        //     return setithbit(n, i);
        // }
    }

    public static void main(String[] args) {
        System.out.println(updateithbit(12, 3, 0));
    }
}
