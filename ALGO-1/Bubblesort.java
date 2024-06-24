public class Bubblesort {
    public static void bubblesorting(int arr[]) {
        int temp = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //printing the sorted array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 1, 3, 2 };
        bubblesorting(numbers);

    }
}