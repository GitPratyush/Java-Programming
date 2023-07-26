
//540. Single Element in a Sorted Array
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end =arr.length-1;
        //checking for the boundary condition:-
        if(end==0){
            return arr[0];
        }
        else if(arr[0]!=arr[1]){
            return arr[0];
        }
        else if(arr[end]!=arr[end-1]){
            return arr[end];
        }
        //after cheking for boundary condition we apply binary search:-
        while(start<=end){
            int mid=start+(end-start)/2;

            //unique element condition:-

            if(arr[mid]!=arr[mid+1]&&arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if((mid%2==0 &&arr[mid]==arr[mid+1])|| (mid%2==1 && arr[mid]==arr[mid-1])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}