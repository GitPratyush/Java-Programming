import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgsMethod {
    public static void main(String[] args) {
        fun(2,3,4,5,5,6,666,7754,345,654,34,22);
    }


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
