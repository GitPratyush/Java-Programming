import java.util.Scanner;

public class SearchINrange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements: ");
        for (int i=0; i<n; i++)
            arr[i]=in.nextInt();
        System.out.println("enter start index: ");
        int k=in.nextInt();
        System.out.println("enter end index: ");
        int m=in.nextInt();
        System.out.print("enter the target: ");
        int target=in.nextInt();
        System.out.print("Target is at Index :");
        System.out.println(searching(arr,target,k,m));
    }

    static int searching(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }

        for (int i=start; i<end; i++){
            int element=arr[i];
            if (target==element){
                return i;
            }
        }
        return -1;
    }
}
