import java.util.Arrays;

public class TwosumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int target=10;
        int[] ans=twosum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] twosum(int[] arr, int target){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}