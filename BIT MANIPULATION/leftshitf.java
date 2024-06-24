public class leftshitf {
    public static void main(String[] args) {
        // Bit Manipulation in Java involves operations on individual bits of a binary
        // representation of numbers.

        // Left Shift (<<) Operation:
        // Left shifting a binary number moves all bits to the left by a specified
        // number of positions.
        // For each left shift by one position, the value is effectively multiplied by
        // 2.
        // Example:
        int num1 = 5; // Binary: 0000 0101
        int leftShifted = num1 << 2; // Left shifting 'num1' by 2 positions.
        // After left shift by 2 positions: 00'01 01'00 (Decimal: 20)
        System.out.println("Left Shift Result: " + leftShifted); // Output: 20

        // Right Shift (>>) Operation:
        // Right shifting a binary number moves all bits to the right by a specified
        // number of positions.
        // For each right shift by one position, the value is effectively divided by 2
        // (rounded towards negative infinity for negative numbers).
        // Example:
        int num2 = 20; // Binary: 0001 0100
        int rightShifted = num2 >> 2; // Right shifting 'num2' by 2 positions.
        // After right shift by 2 positions: 0000 0101 (Decimal: 5)
        System.out.println("Right Shift Result: " + rightShifted); // Output: 5
    }
}