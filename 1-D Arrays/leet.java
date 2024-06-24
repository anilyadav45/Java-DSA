public class leet {
    public static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    // System.out.print("[" + i + "," + j + "]");
                    // break;
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 5, 1, 5, 2 };
        int target = 7; // 0 , 2
        twosum(numbers, target);
    }
}
