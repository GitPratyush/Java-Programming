public class linearsearch1 {
    public static void main(String[] args) {
    int[] nums={1,20,3,4,45,61,31,42,5,96,30,24,455,3442,243};
    int target=42;
        System.out.println(linearsearch(nums,target));
    }
    //search in the array : return the index if item found
    //otherwise if the item not found return -1
    static int linearsearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }

        //run a loop
        for (int index = 0; index <arr.length; index++) {
            //check for element at every index if it is= target
            int element = arr[index];
            if (element ==target){
                return index;

            }
        }
        //this line will be executed if none of the return statements
        //above executed hence target not found.
        return -1;
    }

}