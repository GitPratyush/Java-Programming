
//    https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
class MINrotatedShorted {
    public int findMin(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[end]==arr[mid]){
                end--;
            }
            else if(arr[end]>arr[mid]){
                end=mid;
            }
            else{
                //if arr[high]<arr[mid]
                start=mid+1;
            }
        }
        return arr[start];
    }
}