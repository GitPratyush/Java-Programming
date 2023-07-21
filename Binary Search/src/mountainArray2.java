public class mountainArray2 {
    public static void main(String[] args) {

    }
    static int peakelement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (mid>0 && mid<end){
                if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return mid;
                } else if (arr[mid-1]>arr[mid]) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            } else if ( mid==0) {
                if (arr[0]>arr[1]){
                    return 0;
                }
                else {
                    return 1;
                }
            } else if (mid==end-1) {
                if (arr[end-1]>arr[end-2]){
                    return end-1;
                }
                else {
                    return end-2;
                }
            }

        }
        return -1;
    }
}
