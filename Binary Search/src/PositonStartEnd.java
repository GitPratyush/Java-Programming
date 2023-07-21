import java.util.Arrays;

public class PositonStartEnd {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,5,5,5,6,7,9};
        int target=5;
        int left= LeftBound(nums,target);
        int right=RightBound(nums,target);
        int[] ans= {left,right};
        System.out.println(Arrays.toString(ans));
    }

    private static int RightBound(int[] nums, int target) {
        int index=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                index=mid;
                start=mid+1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return index;
    }

    private static int LeftBound(int[] nums, int target) {
        int index=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                index=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return index;
    }
}
