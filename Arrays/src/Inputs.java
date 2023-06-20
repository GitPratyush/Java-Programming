import java.util.Arrays;
import java.util.Scanner;

//taking inputs in an array
public class Inputs {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr=new int [5];
        for (int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }

        for (int i=0 ; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        //enhanced for loop:-

        for(int num : arr){ //for every element in the array, print the element
            System.out.println(num+ " ");  //here num represents element of the array
        }
        System.out.println(arr[5]); //index out of bound error

        //to string method:- converts and array class to a string.
        System.out.println(Arrays.toString(arr));

        //array of objects:-

        String[] str= new String[5];
        for (int i=0; i<str.length; i++){
            str[i]=in.next();      //if we give input as a,b,c,d,e
        }
        System.out.println(Arrays.toString(str)); // the output will be [a,b,c,d,e]


    }
}
