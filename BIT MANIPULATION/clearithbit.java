public class clearithbit {
    public static int toclearithbit(int n, int i){
        int bitmask = ~(1<<i); //taking complement 
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(toclearithbit(12, 2));
    }
}
