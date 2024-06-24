public class leetcode_a {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
                k++;
            } else {
                merged[k] = nums2[j];
                j++;
                k++;
            }

        }
        // for remaining elements
        while (i <= m) {
            merged[k++] = nums1[i++];
        }
        while (j <= n) {
            merged[k++] = nums2[j++];
        }
    }
    // public static void main(String[] args) {
    //     int arr[] = {8,1,2,4,5,3,7,9};

    // }
}
