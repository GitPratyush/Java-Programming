public class sumNto1 {
    public static void main(String[] args) {
        System.out.println(summ(5));
    }

    static int summ(int i) {
        //base condition if n is less than or equals to 1 it should return;
        if (i <=1) {
            return 1;
        }
        return i+summ(i-1);
    }
}
