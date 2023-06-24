import java.util.Arrays;

public class SwapINDEX {
    public static void main(String[] args) {
        int[] arr={1,33,65,48,93,65};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
//revere the array
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length -1; 
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
