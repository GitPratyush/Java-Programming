import java.util.Arrays;

public class RotateTOright {
    static void reverseRight(int[] arr,int n, int k ){
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr, int start, int end) {
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int k=2;  //no of elements to be rotated to left
        int n= arr.length; //size of the array
        reverseRight(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
}
