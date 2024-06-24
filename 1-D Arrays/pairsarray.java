public class pairsarray {
    public static void possiblepair(int arr[]) {
        int TotPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - i; j++) {
                // printing pairs
                System.out.print("( " + arr[i] + " " + arr[j] + " )");
                TotPair++;
            }
            System.out.println();
        }
        System.out.println("The total possible numbers of pairs is : " +TotPair);
    }

    public static void main(String[] args) {
        int Numbers[] = { 3, 4, 6, 7, 9, 2 };
        System.out.println("Possible pairs for above arrays are : ");
        possiblepair(Numbers);
    }
}