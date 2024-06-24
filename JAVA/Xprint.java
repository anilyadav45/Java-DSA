public class Xprint {
    public static void main(String[] args) {
        int size = 5; // Adjust the size as per your requirement
        printCrossPattern(size);
    }

    public static void printCrossPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
