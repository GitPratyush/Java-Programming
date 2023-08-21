import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={2,4,5,2,1,4,8,-10};
        InsertionShort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionShort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swappp(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swappp(int[] arr, int first, int end) {
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
