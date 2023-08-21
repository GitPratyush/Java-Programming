import java.util.Arrays;

public class selectionsrt {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            //finding the max number indexx is the first priority
            int last=arr.length-i-1;
            int max=getMax(arr, 0, last);
            Swappp(arr,max,last);
        }
    }

    static  void Insertion(int[] arr){
        for (int i=0;i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                //finding the element using insertion short

            }
        }
    }

    static void Swappp(int[] arr, int max, int last) {
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    static int getMax(int[] arr,int start,int end){
        int max=start;
        for (int i = 0; i <= end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}