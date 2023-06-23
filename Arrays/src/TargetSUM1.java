//Find the total number of pair in the array whose sum is equal to the given value:


import java.util.Scanner;

public class TargetSUM1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n= in.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter " + n + " elements ");

        //taking inputs in the arrays:-
        for (int i=0 ; i< arr.length; i++){
            arr[i]=in.nextInt();
        }
        //taking input for the target sum:-
        System.out.print("Enter the number: ");
        int target=in.nextInt();

        //calling the function
        System.out.print("The number of pairs with sum "+ target+" are: ");
        System.out.print(targetSum(arr,target));

    }

    static int targetSum(int[] arr, int target) {
        int n=arr.length;
        int count=0;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]+arr[j]==target){
                    count+=1;
                }
            }
        }
        return count;

    }

    //simple code
//        int[] arr={1,3,5,6,3,7,2,4,1};
//        int temp=5;
//        int count =0;
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[i]+arr[j]==temp){
//                    count=count+1;
//                }
//            }
//        }
//        System.out.println(count);
//    }
}


//In case of triplet sum we will use 3 loop one for the first line to iterate on i another to iterate on j=i+1 and other to iterate on k=j+1//
//simple code for triplet sum
//        int[] arr={1,3,5,6,3,7,2,4,1};
//        int temp=5;
//        int count =0;
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                for(int k=j+1; k<arr.length; k++){
//                    if (arr[i]+arr[j]+arr[k]==temp){
//                        count=count+1;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    }