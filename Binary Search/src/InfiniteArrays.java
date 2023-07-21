public class InfiniteArrays {
    public static void main(String[] args) {
       int[] arr={
               2,3,4,5,6,43,77,88,12,32,55,88,66,21,123,64,38
       };
       int target=66;
       System.out.println(pos(arr,target));
    }
    static int pos(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return BinearySearch(arr,target,start,end);
    }

    static int BinearySearch(int[] arr, int target, int start, int end) {
        while(start<end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
