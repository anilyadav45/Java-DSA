public class bubblesort {
    public static void bublesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // n-1 changes automatically changes all it saves time otherwise we
                                                   // can do also but it increase TC
            for (int j = 0; j < arr.length - i - 1; j++) {
                // (length-i-1)This change ensures that in each iteration, the inner loop goes
                // one step fewer to the end of the array because after each iteration of the
                // outer loop, the largest element is placed at the end, so it doesn't need to
                // be checked again.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // arr[j] == khali
                    arr[j] = arr[j + 1]; // arr[j] = next vlaue bharagelai
                    arr[j + 1] = temp; // next term me first bharagelai
                }
            }
        }
    }

    public static void printsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bublesort(arr);
        printsort(arr);
    }
}