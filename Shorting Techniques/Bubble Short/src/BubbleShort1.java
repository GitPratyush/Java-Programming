import java.util.Arrays;

public class BubbleShort1 {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,3,3};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){

        //avoiding condition if the array is already shorted;
        boolean swapped;

        //run the steps n-1 times
        for (int i=0; i<arr.length;i++){
            //
            swapped=false;

            //in each step the large integer will come  at last respective index;
            for (int j= 1; j<arr.length-i; j++){
                //swap if the current element is smaller than the previous element;
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    //if swapping takes place;
                    swapped=true;
                }
            }
            //if swapping not occurs for a particular value of i then it  means the array is already shorted hence stop the program
            //if not swapped break
            //this statement will run when the array is not swapped
            if (!swapped){
                break;
            }
        }

    }
}