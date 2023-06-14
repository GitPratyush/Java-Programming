//Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1= input.nextInt();
        System.out.println("Enter second Number: ");
        int num2= input.nextInt();
        System.out.println("Choose any operator: +,-,/,*");
        char s= sc.next().charAt(0);
        if (s=='+'){
            System.out.println("sum is "+(num1+num2));
        }
        else if (s=='-'){
            System.out.println("sum is "+(num1-num2));
        }
        else if (s=='/'){
            System.out.println("sum is "+(num1/num2));
        }
        else if (s=='*'){
            System.out.println("sum is "+(num1*num2));
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
