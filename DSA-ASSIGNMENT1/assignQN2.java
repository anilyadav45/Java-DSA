public class assignQN2 {
    public static int indexcheck(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 9;
        System.out.println(indexcheck(numbers, target));
    }
}
