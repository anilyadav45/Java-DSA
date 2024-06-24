public class subarrsumprefix {
    public static void presum(int arr[]) {
        int currsum = 0;
        int maxsum = 0;
        int prefix[] = new int[arr.length];
        // For calculating prefixes
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        //
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[start] - prefix[end];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum is : " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, -1, 4, 5, -3 };
        presum(numbers);
    }
}
