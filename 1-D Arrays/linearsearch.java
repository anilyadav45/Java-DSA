public class linearsearch {
    public static int linearsearchm(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // In linear search data is searched one by one through index
    public static void main(String[] args) {
        int myarray[] = { 12, 34, 53, 53, 123, 11, 23, 10 };
        int value = 53;
        int key = linearsearchm(myarray, value);
        if (key == -1) {
            System.out.println("This elment does't exist in above arrays please search exact element");
        } else {
            System.out.println("The position found of this " + value + "  in above arrays  is : " + key);
        }
    }
}
