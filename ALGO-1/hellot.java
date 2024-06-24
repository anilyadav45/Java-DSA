public class hellot {
    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Finding out the correct position
            while (prev >= 0 && arr[prev] > curr) { //if prev element is bigger than cur it mean it should swap to cur 
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev + 1] = curr;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a new line at the end for better formatting
    }

    public static void main(String[] args) {
        int arrs[] = { 3, 4, 5, 7, 6, 2, 1 };
        insertion(arrs);
        print(arrs);
    }
}
