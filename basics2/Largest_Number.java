//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1= input.nextInt();
        System.out.print("Enter the second Number: ");
        int num2= input.nextInt();
        if (num1>num2){
            System.out.println("Greatest Number is: "+num1);
        }
        else {
            System.out.println("Greatest NUmber is: "+num2);
        }

    }
}
