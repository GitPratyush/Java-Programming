import java.util.Arrays;

import static java.util.Collections.swap;

public class CycleShort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[] arr){
        int i=0;
        while(i < arr.length){
            int truValue=arr[i]-1;
            if (arr[i]!=arr[truValue]){
                swaap(arr,i,truValue);
            }
            else {
                i++;
            }
        }
    }

    static void swaap(int[] arr, int i, int truValue) {
        int temp=arr[i];
        arr[i]=arr[truValue];
        arr[truValue]=temp;
    }
}
