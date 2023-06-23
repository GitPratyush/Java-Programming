//Return the first value that is repeating in this array.
public class firstREPEATINGnum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5,2,3,4,6,1};
        System.out.println("The number is: "+ firstRepeat(arr));
    }

    static int firstRepeat(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
