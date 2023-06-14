//To find Armstrong Number between two given number.

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= input.nextInt();
        int sum=0,r,temp;
        temp=num;
        while(num>0){
            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if (sum==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
