public class arrays4 {
    public static void updated(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            // taking arrays as an arguments
        }
        num = num + 1;
    }

    public static void main(String[] args) {
        int myarr[] = { 1, 2, 3, 4, 5 };
        int n = 6;
        updated(myarr, n);
        // arrays is permanentely changed from function arguments
        //becasue arrays are call by reference that's why updated
        // but general number becomes same in main fun
        for (int i = 0; i < myarr.length; i++) {
            System.out.print(myarr[i] + " ");
        }
        System.out.println();
        System.out.println(n);
    }
}
