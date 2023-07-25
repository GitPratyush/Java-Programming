public class rotatedMINsearch {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2,3,4};
        System.out.println(FindMIn(arr));
    }

    static int FindMIn(int[] arr) {
        int start=0, end=arr.length-1, ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            //if the search space is already shorted then the arr of low will always be the minimum soo we can optimiseit further by:-
//            if (arr[start]<=arr[end]){
//                ans=Math.min(ans,arr[start]);
//                break;
//            }


            if(arr[start]<=arr[mid]){
                ans=Math.min(ans,arr[start]);
                start=mid+1;
            }

            else {
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}
