public class kadansmxsum {
    public static void kadanalg(int arr[]) {
        int cs = 0; // cursum
        int mx = Integer.MIN_VALUE;
        // kadan's algorithm make time complecity less
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0; // it will ignore negative numbers sum coz we already know that negative is
                        // always less not max
            }
            mx = Math.max(mx, cs); // this method auto choose max value among max and min

        }
        System.out.println("The maximum value for above Subarrays is : " + mx);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, 3, 1, 4, 5, -3, 6 };
        kadanalg(numbers);
    }
}
// by using kadan's algorithm we can see the time complexcity
//time-com = 0(n) only 