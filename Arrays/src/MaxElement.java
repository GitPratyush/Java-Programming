import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={1,23,43,4,2};
        System.out.println(Arrays.toString(arr));
        max(arr);
        System.out.println(max(arr));
    }

    static  int max(int[] arr) {
         int maxVal=arr[0];
         for (int i=0; i<arr.length; i++){
             if (arr[i]>maxVal){
                 maxVal=arr[i];
             }
         }
         return maxVal;
    }
}
