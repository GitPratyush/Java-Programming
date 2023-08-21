public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,11};
        int target=7;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    //here s -> start & e -> end both are in the arguments because they are used for every recursive call
    static int search(int[] arr,int target,int s, int e){
        if (s>e){
            return -1;
        }

        //we are declaring mid in the body section because after every recursive call we need  middle element
        int m= s+(e-s)/2;

        if (target==arr[m]){
            return m;
        }

        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }

        return search(arr,target,m+1,e);

    }
}
