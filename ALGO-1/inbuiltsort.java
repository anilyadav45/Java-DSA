import java.util.Arrays;
// .* for all but also we can give .Arrays for use inbuilt fun
import java.util.Collections; // for descending sort

public class inbuiltsort {
    public static void printsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function for printing Desc-Order through Collections
    public static void printDEsc(Integer arr2[]) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 4, 9, 2, 1, 5, 7, 8 };
        Arrays.sort(arr);
        printsort(arr); // method to print all elemnt as sorted
        System.out.println();
        int arr1[] = { 6, 3, 4, 9, 2, 1, 5, 7, 8 };
        Arrays.sort(arr1, 0, 5); // here acc to index sorting i.e 0 - 4
        printsort(arr1);
        System.out.println();
        Integer arr2[] = { 6, 3, 4, 9, 2, 1, 5, 7, 8 };
        // Descending Sort we use COLLECTIONS :
        Arrays.sort(arr2, Collections.reverseOrder());// COLLECTIONS ONLY WORK IN OBJECTS SO WE MUST CHANGE INT TO
                                                      // INTEGER
        // arr2 reversed but for printing in function we must change int to Integer in
        // printsort() here instead i am using another function for print that is
        // printDEsc()
        printDEsc(arr2);
        System.out.println();
        // Same like ascending we can give limit for sort
        Integer arr3[] = { 6, 3, 4, 9, 2, 1, 5, 7, 8 };
        Arrays.sort(arr3, 0, 5, Collections.reverseOrder());
        printDEsc(arr3);

    }
}
