import java.util.Scanner;

public class linearsearch2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements: ");
        for (int i=0; i<n; i++)
            arr[i]=in.nextInt();
        System.out.print("enter the target: ");
        int target=in.nextInt();
        System.out.println(searching(arr,target));
    }


    static int searching2(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int element : arr) {
            if (target == element) {
                return element;
            }
        }
        return -1;
    }



    static int searching(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            int element=arr[i];
            if (target==element){
                return i;
            }
        }
        return -1;
    }

}
