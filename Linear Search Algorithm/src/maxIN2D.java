public class maxIN2D {
    public static void main(String[] args) {
        int[][] arr={
            {3,4,5,7},
            {78,34,21},
            {54,23,99}
        };
        int max=maax(arr);
        System.out.println(max);
    }

    static int maax(int[][] arr) {
    int maxi=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j]>maxi) {
                    maxi = arr[i][j];
//                    return new int[]{i,j}
                }
            }
        }
        return maxi;
    }

}
