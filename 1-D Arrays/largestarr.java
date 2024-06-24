public class largestarr {
    public static int largestarr(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        System.out.println(lowest);
        return largest;
    }

    public static void main(String[] args) {
        int myarrays[] = { 12, 32, 42, 33, 42, 423, 23, 232, 2 };
        int largur = largestarr(myarrays);
        System.out.println(largur);
    }
}