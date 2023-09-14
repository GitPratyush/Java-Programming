import java.util.Arrays;

public class RotateTOleft {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int k=2;  //no of elements to be rotated to left
        int n= arr.length; //size of the array
        reversal(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    static void reversal(int[] arr,int n, int k){
        reverse(arr, 0, k - 1);  // Reversing  first k elements


        reverse(arr, k , n - 1);   // Reversing last n-k elements

        reverse(arr, 0, n - 1);  // Reversing whole array
    }

    static void reverse(int[] arr, int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
