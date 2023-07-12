import java.util.Arrays;

public class LinearSearch3 {
    public static void main(String[] args) {
        int arr[][]={
                {2,3,4,5},
                {54,24,12},
                {9,32,12,5,7}
        };
        int target=54;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
