public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89}; // array must be shorted
        int target=6;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //finding the middle element using " mid = start+(end-start)/2 "
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}