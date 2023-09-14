public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumdigit(5043));
    }

    static int sumdigit(int n) {
        //base condition if our number becomes 0 we should return 0
        if (n == 0) {
            return 0;
        }
        return (n%10)+sumdigit(n/10);
    }
}
