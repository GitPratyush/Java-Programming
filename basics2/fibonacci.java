//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter the last number: ");
        int limit= input.nextInt();
        System.out.print(a+" ");
        for (int i=2;i<=limit;i++){
           int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
