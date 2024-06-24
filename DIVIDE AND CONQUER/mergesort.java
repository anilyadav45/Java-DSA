public class mergesort {
    public static void printlist(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergesorting(int arr[], int fi, int li) { // fi-first-index li-last-index
        // base case
        if (fi >= li) {
            return;
        }
        // main kaaam
        int mid = (li + fi)/2; 
        // for left part assume //recursive fun call from fi = 0 to mid
        mergesorting(arr, fi, mid); 
        // for right part assume start from mid + 1
        mergesorting(arr, mid + 1, li);

        // after finding left and right part we have to merge both the parts to get
        // sorted array
        merge(arr, fi, mid, li);

    }

    public static void merge(int arr[], int fi, int mid, int li) {
        int temp[] = new int[li - fi + 1];
        int i = fi; // (starting)iterator for right part
        int j = mid + 1; // (starting)iterator for left part
        int k = 0; // iterator for temp
        while (i <= mid && j <= li) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++; // taking from left part
            } else {
                temp[k] = arr[j];
                j++; // taking form right part
                k++;
            }
        }

        // above elemtns copied but for remaining elemnts
        // left rem sub array elem
        while (i <= mid) {
            arr[k++] = arr[i++];
        }
        // right rem elem
        while (j <= li) {
            arr[k++] = arr[j++];
        }
        for (k = 0, i = fi; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arrays[] = { 5, 3, 6, 2, 9, 4, 1, 7 };
        System.out.print("Unsorted Arrays : ");
        printlist(arrays);
        System.out.println();
        System.out.print("Sorted Arrays : ");
        mergesorting(arrays, 0, arrays.length - 1);
        printlist(arrays);
    }
}