//        Problem: Find the sum of all even numbers between 1 and a given number.
//        Write a program that takes an integer input from the user and calculates the sum of all even numbers between 1 and that number (inclusive). Display the sum at the end.

import java.util.Scanner;

public class sumOfALLeven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int sum=0;
        for (int i=1; i<=num; i++){
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("sum is: "+sum);
    }
}
