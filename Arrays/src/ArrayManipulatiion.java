//find the unique number in the given array where all the
// element are being repeated twice with one value being unique.

public class ArrayManipulatiion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,2,1,4,6};
        for (int i = 0; i < arr.length ; i++) {
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }
        int ans=-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        System.out.println("The Unique no is: "+ans);
    }
}
