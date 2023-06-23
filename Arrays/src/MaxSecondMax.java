public class MaxSecondMax {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 6, 4, 35, 234};
        System.out.println("Maximum is: "+ findMax(arr));
        System.out.println("Second max is: "+ secMax(arr));
    }

    static int secMax(int[] arr) {
        int mx=findMax(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }

    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
}