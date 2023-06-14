//Input currency in rupees and output in USD.

import java.util.Scanner;

public class rupees_dollar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Amount in Rupees");
        float rupees= input.nextFloat();
        System.out.println("Amount in Dollar: "+(rupees*0.012));
    }
}
