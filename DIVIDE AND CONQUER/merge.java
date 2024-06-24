public class merge {
    public static void merge_sorting(int arr[], int fi, int li) {
        // Base case
        if (fi >= li) {
            return;
        }
        // Main work
        int mid = (li + fi) / 2;
        // Sort left subarray
        merge_sorting(arr, fi, mid);
        // Sort right subarray
        merge_sorting(arr, mid + 1, li);
        // Merge both sorted subarrays
        merge(arr, fi, mid, li);
    }

    public static void merge(int arr[], int fi, int mid, int li) {
        int i = fi;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[li - fi + 1];

        while (i <= mid && j <= li) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Copy remaining elements from right subarray
        while (j <= li) {
            temp[k++] = arr[j++];
        }
        // Copy sorted elements from temp back to arr
        for (k = 0, i = fi; i <= li; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void printlist(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 6, 2, 1 };
        merge_sorting(arr, 0, arr.length - 1);
        printlist(arr);
    }
}
