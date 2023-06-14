//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num= input.nextInt();
        int r,sum=0,temp;
        temp=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
