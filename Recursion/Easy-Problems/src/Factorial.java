public class Factorial {
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        //base condition when n is less than or equal to 1 it will return from there cuz n*1 is n & factorial of 1 is 1;
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
