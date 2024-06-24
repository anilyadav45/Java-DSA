public class getithbit {
    // Method to get the ith bit of a given number
    public static int Togetithbit(int num, int i) {
        // Create a bitmask with the ith bit set to 1 and all other bits set to 0
        int bitmask = 1 << i;

        // Check if the ith bit of the number is 0 by performing a bitwise AND operation
        // between the number and the bitmask. If the result is 0, the ith bit is 0,
        // otherwise, it's 1.
        if ((num & bitmask) == 0) {
            return 0; // Return 0 if the ith bit is 0
        } else {
            return 1; // Return 1 if the ith bit is 1
        }
    }

    public static void main(String[] args) {
        // Example usage: get the 2nd bit of the number 10 (1010 in binary)
        System.out.println(Togetithbit(10, 2)); // Output will be 1
    }
}
