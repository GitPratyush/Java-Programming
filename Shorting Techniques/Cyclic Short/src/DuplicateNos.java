import static java.util.Collections.swap;

public class DuplicateNos {
    public static void main(String[] args) {
    }
    static int Duplicates(int[] arr){
        int i = 0;
        while(i<arr.length){
            if (arr[i]!=i+1){
                int correct=arr[i]-1;
                if (arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
