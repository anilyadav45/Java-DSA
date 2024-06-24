public class trappedwater {
    public static int findrainwater(int arr[]) {
        // Calculate left max boundry -array
        int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }
        // Calculate right max boundry - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }
        // trapped water loop
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - arr[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = { 2, 4, 1, 0, 6, 3 };
        System.out.println(findrainwater(height));
    }
}
