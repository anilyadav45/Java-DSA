public class selecsortt {
    public static void selsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i; // minpos for understanding
            for (int j = i + 1; j < n; j++) {// j=turn + 1 starting for inner loop
                if (arr[minpos] > arr[j]) {
                    minpos = j; // if minpose greater it mean j is smaller so j selected here
                }
            }
            // swap smaller ele at first
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }

    public static void printar(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2, 4, 6, 8, 5, 3 };
        selsort(arr);
        printar(arr);

    }
}
