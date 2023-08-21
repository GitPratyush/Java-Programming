import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class AllMissing {
    public List<Integer> findDisappearedNumbers(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index=0; index<arr.length; index++){
            if (arr[index]!=arr[index+1]){
                ans.add(index+1);
            }
        }
        return ans;
    }


    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
