public class subarrsum {
    public static void sumsubarr(int arr[]) {
        int start;
        int end;
        int sum = 0;
        int indS = 0;
        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = i; j < arr.length; j++) {
                end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    indS += arr[k];
                }
                System.out.print(" Sum  = " + indS);
                indS = 0;
                System.out.println();
            }

            sum = 0;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        sumsubarr(numbers);
    }
}
