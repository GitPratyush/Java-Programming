import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
        1 3 4
        3 4 5
        7 6 3
         */
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println(arr.length); //represents no of rows
//        int[][] arr={
//                {1,2,3}, //0th index
//                {5,6,3},  //1st index
//                {9,6,8,1} //2nd index --> arr2D[2]={9,6,8,1}
//        };
        //Taking Input Of a 2D Array
        for (int row=0; row<arr.length; row++){
            //here it takes every row of the matrix
            for (int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output of the 2d Array
//        for (int row=0; row<arr.length; row++){
//            //here it take s every row of the matrix
//            for (int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //other output method
//       for (int row=0; row<arr.length; row++){
//           System.out.println(Arrays.toString(arr[row]));
//       }

       //using enhanced for loop:-
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
