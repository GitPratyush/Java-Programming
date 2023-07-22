//import static java.util.Arrays.binarySearch;
//
//public class RotatedBinarySearch {
//    public static void main(String[] args) {
//        int[] arr={5,6,7,8,2,3,4};
//        System.out.println(Search1(arr));
//    }
//    //code for searching in the arrays
//    static  int Search1(int[] nums,int target){
//        int pivot=FindPivot(nums);
//        //if pivot is not found then the array  is not rotated
//        if(pivot==-1){
//            return binarySearch(nums,target,0,pivot-1);
//        }
//
//        //if pivot is found and we get 2 arrays ascending
//        if(nums[pivot]==target){
//            return pivot;
//        }
//        if(target>=nums[0]){
//            return binarySearch(nums,target,0,pivot-1);
//        }
//
//        // code for normal binary search
//        return binarySearch(nums,target,0,nums.length-1);
//    }
//    //code for binary search
//    static int binarySearch(int[] arr,int target,int start,int end){
//        while(start<=end){
//            int mid= start+(end - start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    //code to find pivot
//    static  int FindPivot(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid= start+(end-start)/2;
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(mid>start && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if (arr[mid]<=arr[start]){
//                end=mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//        }
//        return -1;
//    }
//}
