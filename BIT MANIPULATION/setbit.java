public class setbit {
    public static int countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // to chek LSB
                count++;
            }
            n = n >> 1; // right shift
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countsetbits(15)); // 1111 so output will be 4 set bits
    }
}
