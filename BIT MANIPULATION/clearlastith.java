public class clearlastith {
    public static void main(String[] args) {
        int n = 10 , i = 1;
        int bitmask = (-1)<<i;
        int res = n & bitmask;
        System.out.println(res);
    }
}
