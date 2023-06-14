//WAP to calculate percentage of a given student. His marks from 5 subjects.

import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the marks in subject-1: ");
        int sub1= input.nextInt();
        System.out.print("Enter the marks in subject-2: ");
        int sub2= input.nextInt();
        System.out.print("Enter the marks in subject-3: ");
        int sub3= input.nextInt();
        System.out.print("Enter the marks in subject-4: ");
        int sub4= input.nextInt();
        System.out.print("Enter the marks in subject-5: ");
        int sub5= input.nextInt();
        float percentage = (sub1+sub2+sub3+sub4+sub5)/500.0f*100.0f;
        System.out.print("Percentage: "+percentage);
    }
}
