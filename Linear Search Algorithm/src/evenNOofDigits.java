//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class evenNOofDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static  int findNumbers(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
//function to check weather a number contains even digits or not
    static boolean even(int num) {
        int numberofDigits =digits(num);
        if (numberofDigits % 2==0){
            return true;
        }
        return false;
    }

    //count the number of digits in the number
    static int digits(int num){
//        if (num<0){
//            num=num*-1;
//        }
//        if (num==0){
//            return 1;
//        }
//
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
        if(num<0){
            num=num * -1;
        }
        return (int)(Math.log10(num))+1;
    }
}
