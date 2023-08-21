public class Missmatched {
    public int[] findErrorNums(int[] arr) {
        int i =0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        //finding the missing number here:-

        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                return new int[] {arr[index] , index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
