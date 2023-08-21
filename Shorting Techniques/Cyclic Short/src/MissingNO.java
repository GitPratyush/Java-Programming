import java.util.Arrays;

public class MissingNO {
    public static void main(String[] args) {
       int[] arr={2,6,9,3,0,5};
       int missingno=Missing(arr);
       System.out.println(missingno);
    }
    static int Missing(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        //now search for the missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                return j;
            }
        }
        //else return length of array
        return arr.length;
    }

    //swwap function

    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
