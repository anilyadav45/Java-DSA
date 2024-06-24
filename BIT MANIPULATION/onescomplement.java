public class onescomplement {
    public static void main(String[] args) {
        System.out.println(~5); // one's comp of 5
        System.out.println(~-6);
        System.out.println(~0);
    }
}
// Note: In computer systems, zero ('0') is represented as all bits set to zero.
// When we consider a 32-bit integer value, the one's complement of zero is not
// simply "one 1"; rather, it's the inversion of all bits. So, initially, zero
// is represented as 0000 0000 0000 0000, and after applying the one's
// complement operation, it becomes 1111 1111 1111 1111. In two's complement
// representation, this translates to -1.

// Similarly, let's examine the one's complement of 5. Starting with the binary
// representation of 5 as 0000 0000 0000 0101, applying the one's complement
// operation flips all the bits to get 1111 1111 1111 1010. This binary
// representation is equivalent to -6 in two's complement notation.

// Therefore, in summary, the one's complement of 5 results in -6. This is
// because the one's complement operation flips all bits, and in two's
// complement representation, the resulting binary represents the negative
// value.
