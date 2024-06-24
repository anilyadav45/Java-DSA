public class binarysearch {
    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key>arr[mid]) {
                start = mid + 1; // for right side search
            }
            if (key<arr[mid]) {
                end = mid - 1;// for left side search
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 5, 7, 9, 11, 13 };// arrays must be sorted for binary search
        int key_value = 9;
        int from_fun = binarysearch(numbers, key_value) + 1;
        if (from_fun == -1) {
            System.out.println("The number you are trying to search doesn't exist please enter valid number ");
        } else {
            System.out.println("The " + key_value + " is found at " + from_fun + " position in given arrays ");
        }

    }
}