import java.lang.reflect.Array;
import java.util.Arrays;

public class workingOFmethod {
    public static void main(String[] args) {
        //creating an array
        int[] arr={1,2,3,4,5};
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changearr(int[] nums) {
        nums[0]= 99; //if you make a change to the object variable via this reference variable, same object will be changed
    }
}
