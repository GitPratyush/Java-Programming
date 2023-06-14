//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the principle amount: ");
        float principle = input.nextFloat();
        System.out.print("enter the time: ");
        float time = input.nextFloat();
        System.out.print("enter the rate: ");
        int rate= input.nextInt();
        System.out.print("your intrest is: "+ principle*time*rate/100);
    }
}
