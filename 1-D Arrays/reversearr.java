public class reversearr {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        int temr_value = 0;
        while (first < last) {
            // swapping
            temr_value = arr[last];
            arr[last] = arr[first];
            arr[first] = temr_value;
            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 3, 5, 2, 4 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
