public class ProductDigit {
    public static void main(String[] args) {
        System.out.println(digitproduct(543));
    }

    static int digitproduct(int n) {
        //base condition should if the number is a single digit number it should return itself
        if (n%10==n){
            return n;
        }
        return (n%10)*digitproduct(n/10);
    }
}
