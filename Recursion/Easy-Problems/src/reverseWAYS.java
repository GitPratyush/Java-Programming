public class reverseWAYS {
    public static void main(String[] args) {
//        reversal(5403);
//        System.out.println(sum);
        System.out.println(palin(5403));
    }

    static int sum=0;
    static void reversal(int n) {
        //base conditon should be if n is equal to 0 return;
        if (n == 0) {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reversal(n/10);
    }
    //CHECK FOR PALINDROME WITH THE HELP OF REVERSE
    static boolean palin(int n){
        return n == rev2(n);
    }



    //SECOND METHOD
    //COMPLEX
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

}
