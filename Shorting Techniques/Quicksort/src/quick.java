import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {     //means the sub array has one element or less, and it's already sorted.
            return;
        }

        int s = low;                   //s and e represent the start and end indices of the current
        int e = hi;                   // sub array, and m calculates the middle index.
        int m = s + (e - s) / 2;     // The pivot element is chosen as the middle element of the current sub array.
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}