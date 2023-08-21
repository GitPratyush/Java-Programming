public class Fibonacci {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fiboo(n));
    }
    static int fiboo(int n){
//        here is the base condition for the recursion if n==0 the fibonacci will be 0 & if n==1 the fibonacci will be 1
        if (n<2){
            return n;
        }
        //it is the argument.
        //the below derivation can be explained by recursive tree
        return fiboo(n-1)+fiboo(n-2);
    }
}