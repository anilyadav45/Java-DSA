public class arrays3 {
    public static void updated(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = arr[i] + 1;
            // taking arrays as an arguments
        }

    }

    public static void main(String[] args) {
        int myarr[] = { 1, 2, 3, 4, 5 };
        int n = 6;
        updated(myarr);
        for (int i = 0; i <= myarr.length; i++) {
            System.out.print(myarr[i]);
        }
        System.out.println(n);
    }
}
