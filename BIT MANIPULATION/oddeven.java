public class oddeven {
    public static void checkOddEven(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    public static void main(String[] args) {
        checkOddEven(4);
        checkOddEven(3);
        checkOddEven(8);
    }
}
